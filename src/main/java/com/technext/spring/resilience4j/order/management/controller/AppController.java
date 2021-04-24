package com.technext.spring.resilience4j.order.management.controller;


import com.technext.spring.resilience4j.order.management.dto.Seller;
import com.technext.spring.resilience4j.order.management.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register/seller")
    public String registerAsSeller(@RequestBody Seller seller) {
        return registrationService.registerSeller(seller);
    }

    @GetMapping("/sellerList")
    public List<Seller> getSellersList() {
        return registrationService.getSellersList();
    }
}
