package com.rishabh.kafkaproducer.model;

import lombok.Data;

@Data
public class User {

    public User(){

    }

    private String name;
    private String department;
    private long salary;
}
