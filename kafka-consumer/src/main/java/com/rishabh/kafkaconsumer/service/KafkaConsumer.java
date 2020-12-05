package com.rishabh.kafkaconsumer.service;

import com.rishabh.kafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    /*@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }*/

    @KafkaListener(topics = "kafka-spring-producer", group = "group_json", containerFactory = "userKafkaListenerFactory")
    public void listenWithHeaders(
            @Payload User message,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("Received Message: \n" + message + "\nfrom partition: " + partition);
    }
}
