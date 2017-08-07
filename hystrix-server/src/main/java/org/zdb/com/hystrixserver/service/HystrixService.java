package org.zdb.com.hystrixserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 依赖服务
 *
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 16:47:18
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@Service
public class HystrixService {
    @Autowired
    private CallDependencyService callDependencyService;
    public String callDependencyService() {
        return callDependencyService.mockGetUserInfo();
    }
}
