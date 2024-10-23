package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example"})
public class Springboot3Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3Application.class, args);
    }

}
