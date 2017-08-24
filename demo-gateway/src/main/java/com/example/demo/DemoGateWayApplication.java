package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
@EnableZuulProxy
public class DemoGateWayApplication {

	public static void main(String[] args) {
        //todo 没有实现熔断机制
		SpringApplication.run(DemoGateWayApplication.class, args);
	}

	@Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
