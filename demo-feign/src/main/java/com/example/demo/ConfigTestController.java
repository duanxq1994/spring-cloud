package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duanx on 2017/8/24.
 */
@RefreshScope
@RestController
public class ConfigTestController {

    @Value("${from}")
    private String from;

    @RequestMapping("from")
    public Object from() {

        return this.from;
    }


}


