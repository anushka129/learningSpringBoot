package com.example.learningSpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentService {

    @GetMapping("/")
    public String pay(){
        String payment = "Payment";
        System.out.println(payment);
        return payment;
    }
}
