package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility.SecurityChainExample;

public class AuthenticationHandler extends SecurityHandler {
    @Override
    public void handleRequest(UserRequest request){
        if (authenticate(request)) {
            System.out.println("AuthenticationHandler: Authentication successful.");
            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("AuthenticationHandler: Authentication failed.");
        }
    }

    private boolean authenticate(UserRequest request) {
        return "user".equals(request.getUsername())
                && "password".equals(request.getPassword());
    }
}
