package com.example.myspringconsolehelloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringConsoleHelloWorldApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin of main!");
        SpringApplication.run(MySpringConsoleHelloWorldApplication.class, args);
        System.out.println("End of main!");
    }

    public void run(String... args) throws Exception {
        System.out.println("Hello from Spring Boot!");
    }

}