package com.example.demo.service;

import net.logstash.logback.encoder.LogstashEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈功能简述〉<br/>
 * 〈Demo impls〉
 *
 * @author lw
 * @date 2018/4/19
 * @since 1.0.0
 */
@Service
public class DemoService2Impl implements DemoService2 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private DemoSerice demoSerice;

    @Override
    public String getDemo2() {
        MDC.put("key1","name");
        MDC.put("env","123");
        logger.info("current source {} {}","java",demoSerice.getDemo1());
        return demoSerice.toString();
    }
}