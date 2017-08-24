package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * created by duanxq on 2017/8/24
 */
@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(Integer a, Integer b) {
        return restTemplate.getForEntity(String.format("http://COMPUTE-SERVICE/add?a=%s&b=%s", a, b), String.class).getBody();
    }

    public String addServiceFallback(Integer a, Integer b) {
        return "error";
    }

}
