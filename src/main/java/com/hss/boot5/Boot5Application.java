package com.hss.boot5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Boot5Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot5Application.class, args);
    }
}
