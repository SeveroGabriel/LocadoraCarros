package com.ufape.locadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ufape.locadora", "com.ufape.locadora.controller", "com.ufape.locadora.negocio", "com.locadora.repo", "com.ufape.locadora.collection"})
@EnableJpaRepositories("com.ufape.locadora.repo")
@EntityScan("com.ufape.locadora")
public class LocadoraCarrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocadoraCarrosApplication.class, args);
    }
}