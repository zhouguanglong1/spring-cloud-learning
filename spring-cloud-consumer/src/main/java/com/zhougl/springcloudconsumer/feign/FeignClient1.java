package com.zhougl.springcloudconsumer.feign;

import com.zhougl.springcloudconsumer.entity.RequestVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author zhougl
 * 2019/4/30
 **/
@org.springframework.cloud.openfeign.FeignClient(value = "provider")
public interface FeignClient1 {
    /**
     * 远程调用test方法
     * @param name 姓名
     * @return String
     */
    @GetMapping("/provider/test")
    String test(@RequestParam("name") String name);

    /**
     * 远程调用test1方法
     * @param requestVO 查询参数
     * @return String
     */
    @GetMapping(value = "/provider/test1")
    String test1(@RequestBody RequestVO requestVO);
//    String test1(@RequestParam Map<String, Object> map);
}
