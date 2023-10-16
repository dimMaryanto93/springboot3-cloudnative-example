package com.maryanto.dimas.example;

import io.opentelemetry.instrumentation.spring.autoconfigure.EnableOpenTelemetry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableOpenTelemetry
public class ApiWilayahApp {

    public static void main(String[] args) {
        SpringApplication.run(ApiWilayahApp.class, args);
    }
}