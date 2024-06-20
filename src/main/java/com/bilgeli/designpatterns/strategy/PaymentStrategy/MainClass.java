package com.bilgeli.designpatterns.strategy.PaymentStrategy;

import com.bilgeli.designpatterns.strategy.PaymentStrategy.dto.PaypalInformaiton;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RequiredArgsConstructor
public class MainClass implements CommandLineRunner {

    private final Client client;
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        client.sendPaymentWithFactory();
        client.sendPaymentWithContext();
    }
}
