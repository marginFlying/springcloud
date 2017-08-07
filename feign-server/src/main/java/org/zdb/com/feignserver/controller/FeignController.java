package org.zdb.com.feignserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.zdb.com.feignserver.client.FeignOrderServerClient;
import org.zdb.com.feignserver.client.FeignUserServerClient;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@RestController
public class FeignController {
    @Autowired
    private FeignOrderServerClient feignOrderServerClient;
    @Autowired
    private FeignUserServerClient feignUserServerClient;
    @GetMapping(value="/feign/order/{name}")
    public ResponseEntity<String> sayOrderHello(@PathVariable("name") String name){
        return feignOrderServerClient.sayOrderHello(name);
    }
    @GetMapping(value="/feign/user/{name}")
    public ResponseEntity<String> sayUserHello(@PathVariable("name") String name){
       return feignUserServerClient.sayUserHello(name);
    }
}
