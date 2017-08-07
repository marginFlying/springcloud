package org.zdb.com.orderserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 该接口使用feign进行调用，被其他的微服务进行使用
     * @param name
     * @return
     */
    @GetMapping(value = "/feign/order/{name}")
    public ResponseEntity<String> sayOrderHello(@PathVariable("name") String name){
        System.out.println("========spring feign-order-server start===========");
        return ResponseEntity.ok("hello,"+name+":welcome to use order-server");
    }
}
