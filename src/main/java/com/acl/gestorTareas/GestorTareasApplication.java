package com.acl.gestorTareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

import io.swagger.v3.oas.annotations.info.Contact;

@OpenAPIDefinition(
	    info = @Info(
	        title = "API Gestor de Tareas",
	        version = "1.0.0",
	        description = "Documentación de la API para gestión de tareas",
	        contact = @Contact(
	            name = "Antonio Carmona López",
	            email = "antocarmonal@gmail.com",
	            url = "https://github.com/AntonioCarmonaLopez"
	        ),
	        license = @License(
	            name = "MIT License",
	            url = "https://opensource.org/licenses/MIT"
	        )
	    ),
	    servers = {
	        @Server(url = "http://localhost:8080", description = "Servidor de desarrollo")
	    }
	)
@SpringBootApplication
public class GestorTareasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorTareasApplication.class, args);
	}

}
