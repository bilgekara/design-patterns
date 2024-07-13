package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility.SecurityChainExample;

public class AuthorizationHandler extends SecurityHandler{
    @Override
    public void handleRequest(UserRequest request){
        if (authorize(request.getRole())) {
            System.out.println("AuthorizationHandler: Authorization successful.");
            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("AuthorizationHandler: Authorization failed.");
        }
    }

    private boolean authorize(String role) {
        return "admin".equals(role);
    }
}
