package br.com.doefacil.doefacil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class DoeFacilApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoeFacilApplication.class, args);
	}

}
