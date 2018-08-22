package com.itpeac;

import java.net.UnknownHostException;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing

public class DatabaseInputApplication2 {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(DatabaseInputApplication2.class, args);
    }
}
