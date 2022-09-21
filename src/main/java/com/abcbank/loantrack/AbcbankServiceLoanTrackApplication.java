package com.abcbank.loantrack;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableFeignClients
@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
public class AbcbankServiceLoanTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcbankServiceLoanTrackApplication.class, args);
	}
	


	
}
