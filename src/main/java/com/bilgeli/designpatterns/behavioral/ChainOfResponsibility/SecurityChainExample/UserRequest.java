package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility.SecurityChainExample;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {
    private String username;
    private String password;
    private String role;
}
