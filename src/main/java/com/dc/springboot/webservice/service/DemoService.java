package com.dc.springboot.webservice.service;

import javax.jws.WebService;

/**
 * @Description
 * @Author DC
 * @Date 2019-10-31
 */
@WebService(name = "DemoService", // 暴露服务名称
        targetNamespace = "http://service.webservice.springboot.dc.com" // 命名空间,一般是接口的包名倒序
)
public interface DemoService {
    public String sayHello(String user);
}