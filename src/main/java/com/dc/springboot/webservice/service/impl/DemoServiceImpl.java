package com.dc.springboot.webservice.service.impl;

import com.dc.springboot.webservice.service.DemoService;
import org.springframework.scheduling.annotation.Async;

import javax.jws.WebService;
import java.util.Date;

/**
 * @Description
 * @Author DC
 * @Date 2019-10-31
 */
@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://service.webservice.springboot.dc.com", //与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.dc.springboot.webservice.service.DemoService" // 接口地址
)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String user) {
        return user+"，现在时间："+"("+new Date()+")";
    }
}
