package com.springboot.spring.petshopproject.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class Swagger {
	
				@Bean
				public OpenAPI usersMicroserviceOpenAPI() {

					Server localhost = new Server();
					localhost.setUrl("http://hostname:9091");
					localhost.setDescription("pet care management");

					Contact contact = new Contact();
					mailto:contact.setEmail("sowmya@gmail");
					contact.setName("petshop");
					contact.setUrl("https://petshop.in");

					License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

					Info info = new Info().title("Pet Care Management").version("1.0").contact(contact)
							.description("endpoint manages the pet care")
							.termsOfService("https://petshop.in/terms").license(mitLicense);

					return new OpenAPI().info(info).servers(List.of(localhost));
				}
			}
