package collectcep_rest.collectcep.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger{

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Collect-API-CEP")
                        .version("1.0")
                        .description("API para consultar informações de endereço a partir de um CEP utilizando a API pública ViaCEP"));
    }
}