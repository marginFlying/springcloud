package org.zdb.com.ribbonserver.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 负载均衡的controller
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 13:23:45
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@RestController
public class LoadController {
    /**
     * The Rest template.
     *
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
     * @date :2017-08-07 13:23:45
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Say hello string.
     *
     * @param server the server
     * @param name   the name
     * @return the string
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
     * @date :2017-08-07 13:23:45
     */
    @GetMapping(value="/{server}/hello/{name}")
    public String sayHello(@PathVariable("server") String server,@PathVariable("name") String name){
        System.out.println(server+"-service"+"say hello"+name);
        return restTemplate.getForEntity("http://"+server+"-server/"+server+"/"+name,String.class).getBody();
    }

}
