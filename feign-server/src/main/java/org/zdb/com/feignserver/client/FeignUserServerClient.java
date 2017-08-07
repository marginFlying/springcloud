package org.zdb.com.feignserver.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.zdb.com.feignserver.hystrix.FeignOrderServerHistrix;

/**
 * 用户服务的feign客户端(使用容错机制，防止服务器宕机不进行汇报)
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 14:03:04
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@FeignClient(value = "user-server",fallback = FeignOrderServerHistrix.class)
public interface FeignUserServerClient {
    /**
     * Say user hello response entity.
     *
     * @param name the name
     * @return the response entity
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
     * @date :2017-08-07 14:03:04
     */
    @GetMapping(value="/user/feign/user/{name}")
    public ResponseEntity<String> sayUserHello(@PathVariable("name") String name);
}
