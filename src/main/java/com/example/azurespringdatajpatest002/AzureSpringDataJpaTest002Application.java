package com.example.azurespringdatajpatest002;

import com.example.azurespringdatajpatest002.glasses.GlassesModel;
import com.example.azurespringdatajpatest002.glasses.GlassesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AzureSpringDataJpaTest002Application {
//3108 2022 test af Spring DataJPA, Spring Web og Mysqldriver til Azure. Skal have en repo, model,
    //plus en rest view; bruge mysql til at forbinde til en sql skema.
    public static void main(String[] args) {
        SpringApplication.run(AzureSpringDataJpaTest002Application.class, args);
    }

    private static final Logger log = LoggerFactory.getLogger(AzureSpringDataJpaTest002Application.class);
    @Bean
    public CommandLineRunner importData(GlassesRepository glassesRepository) {
        return (args) -> {
            final List<GlassesModel> glasses = new ArrayList<>();
            glasses.add(new GlassesModel());
            glasses.get(0).setName("black");
            glassesRepository.saveAll(glasses);
            log.info("saved these fglassses?");
        };
    }
}
