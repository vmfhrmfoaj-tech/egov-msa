package egovframework.msa.sample.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan("egovframework.*")
@SpringBootApplication
public class CatalogApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

	public static void main(String[] args) {
		SpringApplication.run(CatalogApplication.class, args);
	}

}
