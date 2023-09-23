package com.tt.learn.entity;

import lombok.Data;

@Data
public class Manager {
    private Long id;
    private String name;
    private String password;
    private String phone;
    private int status;
}
