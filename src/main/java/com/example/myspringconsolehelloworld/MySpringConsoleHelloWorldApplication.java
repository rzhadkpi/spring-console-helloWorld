package com.example.myspringconsolehelloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MySpringConsoleHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Begin of main!");
        SpringApplication.run(MySpringConsoleHelloWorldApplication.class, args);
        System.out.println("End of main!");
    }

    @Component
    @Order(1)
    public static class FirstRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            System.out.println("First");
        }
    }

    @Component
    @Order(2)
    public static class HelloRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            System.out.println("Hello from Spring Boot!");
        }
    }

    @Component
    @Order(3)
    public static class SecondRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            System.out.println("Second");
        }
    }
}
