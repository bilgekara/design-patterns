package com.bilgeli.designpatterns.behavioral.ChainOfResponsibility.SecurityChainExample;

public class AccessControlHandler extends SecurityHandler{
    @Override
    public void handleRequest(UserRequest request) {
        if (hasAccess(request.getUsername())) {
            System.out.println("AccessControlHandler: Access granted.");
        } else {
            System.out.println("AccessControlHandler: Access denied.");
        }
    }

    private boolean hasAccess(String username) {
        return "user".equals(username);
    }
}
