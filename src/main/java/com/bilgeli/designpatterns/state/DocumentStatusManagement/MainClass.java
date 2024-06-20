package com.bilgeli.designpatterns.state.DocumentStatusManagement;

public class MainClass {
    public static void main(String[] args) {
        DocumentContext documentContext = new DocumentContext();
        documentContext.publish();  // Belge incelenmeye gönderildi.
        documentContext.publish();  // Belge onaylandı.
        documentContext.publish();  // Belge yayımlandı.
        documentContext.publish();  // Belge zaten yayımlandı.
    }
}
