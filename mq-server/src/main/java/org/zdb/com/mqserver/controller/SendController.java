package org.zdb.com.mqserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zdb.com.mqserver.Sender;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@RestController
@RequestMapping("/message")
public class SendController {
    @Autowired
    private Sender sender;
    @GetMapping(value="/sendMsg/{msg}")
    public void sendMsg(@PathVariable("msg") String msg){
        System.out.println("=========消息处理开始msg:{"+msg+"}==========");
        sender.send(msg);
        System.out.println("======消息处理完成=====");
    }
}
