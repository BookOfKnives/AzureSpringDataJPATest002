package com.example.azurespringdatajpatest002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureSpringDataJpaTest002Application {
//3108 2022 test af Spring DataJPA, Spring Web og Mysqldriver til Azure. Skal have en repo, model,
    //plus en rest view; bruge mysql til at forbinde til en sql skema.
    public static void main(String[] args) {
        SpringApplication.run(AzureSpringDataJpaTest002Application.class, args);
    }

}
