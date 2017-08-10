package org.zdb.com.streamserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
*/
@RestController
public class SendMsgController {
    @Autowired
    private Producer producer;
    @PostMapping(value="/send/{msg}")
    public void sendMsg(@PathVariable("msg") String msg){
        System.out.println("==========start send message===========");
        producer.sendMsg();
        System.out.println("==========end send message===========");
    }
}
