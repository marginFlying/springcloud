package org.zdb.com.mqserver.producer;

import org.apache.commons.lang.SerializationUtils;
import org.zdb.com.mqserver.EndPoint;

import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
public class MqProducer extends EndPoint{
    public MqProducer(String endPointName) throws IOException, TimeoutException {
        super(endPointName);
    }

    /**
     * 发送消息的方法
     * @param object
     * @throws IOException
     */
    public void sendMessage(Serializable object) throws IOException{
        channel.basicPublish("",endPointName,null, SerializationUtils.serialize(object));
    }
}
