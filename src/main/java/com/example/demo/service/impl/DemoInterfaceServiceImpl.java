package com.example.demo.service.impl;

import com.example.demo.service.DemoInterfaceService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 〈功能简述〉<br/>
 * 〈〉
 *
 * @author lw
 * @date 2018/3/28
 * @since 1.0.0
 */
@Service
@Order(2)
public class DemoInterfaceServiceImpl implements DemoInterfaceService {


    @Override
    public String getServiceName() {

        return "demo2+ wms2+wms1256";
    }
}