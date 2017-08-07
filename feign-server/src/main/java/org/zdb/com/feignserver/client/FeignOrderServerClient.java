package org.zdb.com.feignserver.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 订单服务的feign客户端
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 14:01:58
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@FeignClient("order-server")
public interface FeignOrderServerClient {
    /**
     * Say order hello response entity.
     *
     * @param name the name
     * @return the response entity
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
     * @date :2017-08-07 14:01:58
     */
    @GetMapping(value="/order/feign/order/{name}")
    public ResponseEntity<String> sayOrderHello(@PathVariable("name") String name);
}
