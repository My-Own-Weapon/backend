package com.chimaera.wagubook.dto.request;

import lombok.Data;

@Data
public class MemberRequest {
    private String username;
    private String password;
    private String passwordConfirm;
    private String name;
    private String phoneNumber;
}