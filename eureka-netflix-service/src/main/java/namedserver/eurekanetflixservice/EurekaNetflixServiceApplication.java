package namedserver.eurekanetflixservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNetflixServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNetflixServiceApplication.class, args);
	}

}
