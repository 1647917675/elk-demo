package com.example.demo;

import com.example.demo.component.SpringContextTest;
import com.example.demo.service.DemoInterfaceService;
import com.example.demo.service.DemoSerice;
import com.example.demo.service.DemoService2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author lw
 */
@SpringBootApplication
@RestController
public class DemoApplication {
    @Resource
    private SpringContextTest springContextTest;
    @Resource
    private DemoSerice demoSerice;
    @Resource
    private DemoService2 demoService2;

    @Resource
    @Qualifier(value ="demoInterfaceServiceImpl")
    private DemoInterfaceService[]  demoInterfaceServices;

    @Resource
    private ApplicationContext applicationContext;

    @RequestMapping(value = "/app")
    public String getName() {
        return springContextTest.getApplicationName();
    }

    @RequestMapping(value = "/app2")
    public String getAppName2() {
        return applicationContext.getBean(DemoInterfaceService.class).getServiceName();
    }

    @RequestMapping(value = "/app3")
    public String getAppName3() {
        Random random = new Random();
        return demoInterfaceServices[Math.abs(random.nextInt()) % demoInterfaceServices.length].getServiceName() ;
    }

    @RequestMapping(value = "/demo1")
    public String getAppName4() {
        return demoSerice.getDemo1();
    }

    @RequestMapping(value = "/demo2")
    public String getAppName5() {
        return demoService2.getDemo2();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
