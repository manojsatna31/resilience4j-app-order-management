package com.technext.spring.resilience4j.order.management.service;

import com.technext.spring.resilience4j.order.management.dto.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    @Qualifier("registrationRestTemplate")
    RestTemplate restTemplate;

    public String registerSeller(Seller seller) {
        return restTemplate.postForObject("/seller", seller, String.class);
    }

    public List<Seller> getSellersList() {
        return restTemplate.getForObject("/sellerList", List.class);
    }
}
