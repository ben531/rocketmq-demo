package com.mq.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

/**
 * 第一次成功的案例, 与官方git上的SyncProducer完全雷同, 仅此保留作为纪念, 可以不用管.
 * 单向发送消息, 发送后没有任何结果
 */
public class Producer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("my-group-name-A");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        Message message = new Message("topic-name-A", "tag-name-A", "我要我的滋味".getBytes(RemotingHelper.DEFAULT_CHARSET));
        while (true){
            Thread.sleep(2000);
            producer.send(message);
            System.out.println("Message sended");
        }
//        producer.shutdown();
    }

}
