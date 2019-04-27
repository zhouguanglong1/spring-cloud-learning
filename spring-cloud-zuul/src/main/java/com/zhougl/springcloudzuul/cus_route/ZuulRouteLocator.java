package com.zhougl.springcloudzuul.cus_route;

import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import java.util.Map;

/**
 * @author zhougl
 * 2019/2/20
 **/
public abstract class ZuulRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {

    public final static Logger logger = LoggerFactory.getLogger(ZuulRouteLocator.class);

    private ZuulProperties properties;

//    @Autowired
//    private IZuulRouteRuleMatcher zuulRouteRuleMatcher;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ZuulRouteLocator(String servletPath, ZuulProperties properties) {
        super(servletPath, properties);
        this.properties = properties;
    }

    @Override
    public void refresh() {

    }

    @Override
    protected Map<String, ZuulProperties.ZuulRoute> locateRoutes() {
        return super.locateRoutes();
    }

    @Override
    public Route getMatchingRoute(String path) {
        return super.getMatchingRoute(path);
    }

    @Override
    public int getOrder() {
        return super.getOrder();
    }
}
