package com.zjh.practice.枚举类;

import java.util.Map;

public abstract class AbstractReferenceRelationSync {


    public abstract void buildReferenceRelationInfo(Map<String, Object> paramMap);


    /**
     * 像kafka推送信息
     */
    public void sendMessage2Kafka(String message) {
        // kafkaInstance.sendMessage2KafkaWithPartition(TOPIC, message, 0);

    }
}

