package com.nklongyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaclientsideApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientsideApplication.class, args);
	}

}
