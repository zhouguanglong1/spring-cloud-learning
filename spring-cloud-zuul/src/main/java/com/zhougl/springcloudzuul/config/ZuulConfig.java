package com.zhougl.springcloudzuul.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhougl
 * 2019/2/2
 **/
@Component
public class ZuulConfig {

    /**
     * 通过config配置中心实时获取git或者本地修改的文件的zuul属性，动态刷新获取动态的网关路由
     * @return ZuulProperties
     */
//    @ConfigurationProperties("zuul")
//    @RefreshScope
//    public ZuulProperties zuulProperties(){
//        return new ZuulProperties();
//    }
}
