package com.example.demo.service;

import ch.qos.logback.classic.spi.LoggingEvent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈功能简述〉<br/>
 * 〈demo1 impl〉
 *
 * @author lw
 * @date 2018/4/19
 * @since 1.0.0
 */
@Service
public class DemoServiceImpl implements DemoSerice {
    @Resource
    private DemoService2 demoService2;


    @Override
    public String getDemo1() {
        return demoService2.toString();
    }
}