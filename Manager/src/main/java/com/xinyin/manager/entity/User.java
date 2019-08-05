package com.xinyin.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;

    private String username;

    private String account;

    private String password;

    private String email;

    private String phone;

    private Integer status;

    private String residAddress;

    private String nativePlace;

    private String homeAddress;

    private String emerContact;

    private String emerCall;

}

