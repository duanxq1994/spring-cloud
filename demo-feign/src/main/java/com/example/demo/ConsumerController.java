package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by duanxq on 2017/8/24
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeService computeService;
    @Autowired
    ComputeClient ComputeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Object add(Integer a, Integer b) {
        return computeService.addService(a, b);
    }

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public Object add2(Integer a, Integer b) {
        return ComputeClient.add(a, b);
    }

}
