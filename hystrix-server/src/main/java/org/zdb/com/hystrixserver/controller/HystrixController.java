package org.zdb.com.hystrixserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zdb.com.hystrixserver.service.HystrixService;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@RestController
public class HystrixController {
    @Autowired
    private HystrixService service;
    /**
     * 调用依赖的服务
     */
    @RequestMapping("/call")
    public String callDependencyService(){
        return service.callDependencyService();
    }
}
