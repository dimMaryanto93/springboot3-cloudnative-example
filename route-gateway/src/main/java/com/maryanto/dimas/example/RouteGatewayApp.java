package com.maryanto.dimas.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RouteGatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(RouteGatewayApp.class, args);
    }
}
