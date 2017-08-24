package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by duanx on 2017/8/24.
 */
@Component
public class ComputeClientHystrix implements ComputeClient{



    @Override
    public Integer add(Integer a, Integer b) {
        return -999;
    }
}
