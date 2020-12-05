package com.rishabh.kafkaproducer.controller;

import com.rishabh.kafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;

    private static final String TOPIC = "kafka-spring-producer";

    @GetMapping("/publish/{name}")
    public String postMessage(@PathVariable("name") final String name){
        User user = new User();
        user.setName(name);
        user.setDepartment("Technology");
        user.setSalary(4000000L);
        kafkaTemplate.send(TOPIC, user);

        return "Message Published Successfully";
    }
}
