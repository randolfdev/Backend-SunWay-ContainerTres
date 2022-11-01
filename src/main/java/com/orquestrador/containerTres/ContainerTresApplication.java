package com.orquestrador.containerTres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainerTresApplication {

	@RequestMapping("/")
	public String home() {
		return "Conectado ao ContainerTres";
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainerTresApplication.class, args);
	}

}
