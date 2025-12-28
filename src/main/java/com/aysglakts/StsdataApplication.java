package com.aysglakts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.aysglakts")
@EnableJpaRepositories("com.aysglakts")
public class StsdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(StsdataApplication.class, args);
    }
}
