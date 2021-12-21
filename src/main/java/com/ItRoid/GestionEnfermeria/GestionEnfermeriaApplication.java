package com.ItRoid.GestionEnfermeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class GestionEnfermeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEnfermeriaApplication.class, args);
	}


	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Buenos_Aires"));
	}

}
