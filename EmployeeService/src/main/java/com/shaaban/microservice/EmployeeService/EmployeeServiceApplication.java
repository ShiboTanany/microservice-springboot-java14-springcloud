package com.shaaban.microservice.EmployeeService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EmployeeServiceApplication {

    @Value("${service.instance.name}")
    private String instanceName;


    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }


    @RequestMapping("/")
	public String getInstanceName(){
    	return instanceName;
	}
}
