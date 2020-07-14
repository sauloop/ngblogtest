package info.pablogiraldo.ngblogtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import info.pablogiraldo.ngblogtest.config.SpringSecurityConfig;

@SpringBootApplication(exclude = SpringSecurityConfig.class)
public class NgblogtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgblogtestApplication.class, args);
	}

}
