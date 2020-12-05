package com.rishabh.kafkaconsumer.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    public User(){

    }

    private String name;
    private String department;
    private long salary;
}
