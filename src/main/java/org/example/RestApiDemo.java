package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@SpringBootApplication
@Configuration
public class RestApiDemo {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        SpringApplication.run(RestApiDemo.class, args);

    }
    @Bean
    public Docket swaggerConfiguration(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/cloudvendor/*"))
                .apis(RequestHandlerSelectors.basePackage("org.example.RestApiDemo"))
                .build()
                .apiInfo(apiCustomData());
    }

    private ApiInfo apiCustomData() {
        return new ApiInfo(
                "Cloud Vendor Api Application",
                "Cloud Vendor Documentaion",
                "1.0",
                "Cloud Vendor Service Terms",
                new Contact("Sri","https://google.com","sri@gmail.com"),
                "Google License",
                "http://google.com",
                Collections.emptyList()
        );
    }
}