package com.jhonnyabreu.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MonoliticaSwagger {

	public static void main(String[] args) {
		SpringApplication.run(MonoliticaSwagger.class, args);
	}

	@Bean
	public Docket docket() {
		Docket docket = new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2);
		return docket.apiInfo(apiInfo());
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("Acme Producer (AP) REST API", "Lista de serviços da empresa AP para integração", "Versão API 1.0",
				"Termos de uso", "aluno@e-mail.com", "API License", "API License URL");
		return apiInfo;
	}

}