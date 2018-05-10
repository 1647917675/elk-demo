package com.example.demo.component;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈功能简述〉<br/>
 * 〈〉
 *
 * @author lw
 * @date 2018/3/28
 * @since 1.0.0
 */
@Service
public class SpringContextTest implements ApplicationContextAware {
    @Resource
    private ApplicationContext applicationContext;

    public  String getApplicationName(){
        return applicationContext.getDisplayName() + "demo";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}