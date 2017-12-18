package com.microshop.servicedao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.microshop.servicedao.mapper.**")
public class ServicedaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicedaoApplication.class, args);
	}
}
