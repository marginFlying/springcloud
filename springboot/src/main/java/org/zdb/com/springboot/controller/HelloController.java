package org.zdb.com.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zdb.com.springboot.model.HelloReq;
import org.zdb.com.springboot.model.HelloRes;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value="/{name}",method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(@PathVariable("name") String name){
        System.out.println("========spring demo start===========");
        return ResponseEntity.ok("hello,"+name+":welcome to use springboot first demo");
    }
    @RequestMapping(value="/postHello",method = RequestMethod.POST)
    public ResponseEntity<HelloRes> sayHello(@RequestBody HelloReq req){
        System.out.println("==================spring post test=============");
        return new ResponseEntity(new HelloRes(0,"你好，你的名称是："+req.getName(),"服务ID:"+req.getId()), HttpStatus.RESET_CONTENT);
    }
}
