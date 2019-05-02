package com.zhougl.springcloudconsumer.controller;

import com.zhougl.springcloudconsumer.entity.RequestVO;
import com.zhougl.springcloudconsumer.feign.FeignClient1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zhougl
 * 2019/4/30
 **/
@RestController
//@RequestMapping("test")
public class TestController {
    @Autowired
    FeignClient1 feignClient;

    @RequestMapping("test")
    public String test(String name){
        System.out.println(feignClient.test(name));
        return feignClient.test(name);
    }


    @RequestMapping("test1")
    public String test1(@RequestBody RequestVO requestVO){
        System.out.println(feignClient.test1(requestVO));
        return feignClient.test1(requestVO);
    }
}
