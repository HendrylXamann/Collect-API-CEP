package collectcep_rest.collectcep.controller;
import collectcep_rest.collectcep.dto.DtoData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
public class DataController {

    @GetMapping("/adress/{cep}")
    public ResponseEntity<DtoData> getData(@PathVariable String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        DtoData response = restTemplate.getForObject(url, DtoData.class);
        return ResponseEntity.ok(response);
    }

}