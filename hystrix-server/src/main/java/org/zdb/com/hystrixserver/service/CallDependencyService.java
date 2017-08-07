package org.zdb.com.hystrixserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@Component
public class CallDependencyService {
    private Random random = new Random();
    /**
     * 模拟获取用户信息(通过网络调用)
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String mockGetUserInfo(){
        int randomInt= random.nextInt(10) ;
        if(randomInt<8){  //模拟调用失败情况
            throw new RuntimeException("call dependency service fail.");
        }else{
            return "UserName:admin;number:"+randomInt;
        }
    }

    /**
     * 容错机制的回调方法
     * @return
     */
    public String fallback(){
        return "some exception occur call fallback method.";
    }
}
