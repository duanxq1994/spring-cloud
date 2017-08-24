package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by duanxq on 2017/8/24
 */
@FeignClient("compute-service")
public interface ComputeClient {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a")Integer a, @RequestParam(value = "b")Integer b);

}
