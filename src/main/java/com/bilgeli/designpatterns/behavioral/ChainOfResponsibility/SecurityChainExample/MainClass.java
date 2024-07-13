package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility.SecurityChainExample;

public class MainClass {
    public static SecurityHandler doChaining(){
        SecurityHandler authHandler = new AuthenticationHandler();
        SecurityHandler authzHandler = new AuthorizationHandler();
        SecurityHandler accessControlHandler = new AccessControlHandler();

        authHandler.setNextHandler(authzHandler);
        authzHandler.setNextHandler(accessControlHandler);

        return authHandler;
    }
    public static void main(String[] args) {
        SecurityHandler chainLogger= doChaining();

        chainLogger.handleRequest(createUser1());
        chainLogger.handleRequest(createUser2());
        chainLogger.handleRequest(createUser3());

    }

    public static UserRequest createUser1(){
        return UserRequest.builder()
                .username("user")
                .password("password")
                .role("admin")
                .build();
    }
    public static UserRequest createUser2(){
        return UserRequest.builder()
                .username("user")
                .password("wrongpassword")
                .role("admin")
                .build();
    }
    public static UserRequest createUser3(){
        return UserRequest.builder()
                .username("user")
                .password("password")
                .role("user")
                .build();
    }
}
