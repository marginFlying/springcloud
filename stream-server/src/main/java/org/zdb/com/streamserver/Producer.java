package org.zdb.com.streamserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 生产者
 */

@EnableBinding(Source.class)
public class Producer {
   private Logger logger = LoggerFactory.getLogger(this.getClass());
    @InboundChannelAdapter(value = Source.OUTPUT)
    public String sendMsg() {
        logger.info("==========start send message==========");
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        logger.info("==========end send message==========");
        return format;
    }
}
