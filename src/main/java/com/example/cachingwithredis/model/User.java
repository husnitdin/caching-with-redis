package com.example.cachingwithredis.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
