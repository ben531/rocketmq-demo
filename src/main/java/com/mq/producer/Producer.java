package com.mq.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * 单向发送消息, 发送后没有任何结果
 */
public class Producer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("my-group-name-A");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        Message message = new Message("topic-name-A", "tag-name-A", "我要我的滋味".getBytes());
        while (true){
            Thread.sleep(2000);
            producer.send(message);
            System.out.println("Message sended");
        }
//        producer.shutdown();
    }

}
