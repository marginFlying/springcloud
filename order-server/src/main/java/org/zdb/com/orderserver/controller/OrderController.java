package org.zdb.com.orderserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @RequestMapping(value="/{name}",method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(@PathVariable("name") String name){
        System.out.println("========spring order-server start===========");
        return ResponseEntity.ok("hello,"+name+":welcome to use order-server");
    }
}
