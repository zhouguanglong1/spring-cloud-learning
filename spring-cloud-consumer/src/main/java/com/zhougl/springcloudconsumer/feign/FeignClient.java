package com.zhougl.springcloudconsumer.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhougl
 * 2019/4/30
 **/
@org.springframework.cloud.openfeign.FeignClient(value = "provider")
public interface FeignClient {
    @GetMapping("/provider/test")
    String test(@RequestParam("name") String name);
}
