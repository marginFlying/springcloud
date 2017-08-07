package org.zdb.com.userserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The type User controller.
 *
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 13:57:18
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * Say hello response entity.
     *
     * @param name the name
     * @return the response entity
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
     * @date :2017-08-07 13:57:18
     */
    @RequestMapping(value="/{name}",method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(@PathVariable("name") String name){
        System.out.println("========spring user-server start===========");
        return ResponseEntity.ok("hello,"+name+":welcome to use user-server");
    }

    /**
     * 该接口使用feign进行调用，被其他的微服务进行使用
     *
     * @param name the name
     * @return response entity
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
     * @date :2017-08-07 13:57:18
     */
    @GetMapping(value = "/feign/user/{name}")
    public ResponseEntity<String> sayUserHello(@PathVariable("name") String name){
        System.out.println("========spring feign-user-server start===========");
        return ResponseEntity.ok("hello,"+name+":welcome to use user-server");
    }
}
