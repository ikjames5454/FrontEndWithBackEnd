package com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
@Component
public class ModelMapperWithFrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelMapperWithFrontEndApplication.class, args);
	}

}
