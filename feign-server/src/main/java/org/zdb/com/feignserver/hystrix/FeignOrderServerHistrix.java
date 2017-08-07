package org.zdb.com.feignserver.hystrix;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.zdb.com.feignserver.client.FeignOrderServerClient;

/**
 * 给feign添加容错机制
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 15:02:11
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@Component
public class FeignOrderServerHistrix implements FeignOrderServerClient{
    /**
     * Say order hello response entity.
     *
     * @param name the name
     * @return the response entity
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
     * @date :2017-08-07 14:01:58
     */
    @Override
    public ResponseEntity<String> sayOrderHello(@PathVariable("name") String name) {
        return new ResponseEntity<String>("很抱歉！"+name+",order-server暂时不能提供服务",HttpStatus.OK);
    }
}
