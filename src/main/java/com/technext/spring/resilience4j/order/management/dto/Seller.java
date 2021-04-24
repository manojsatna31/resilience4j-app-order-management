package com.technext.spring.resilience4j.order.management.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Seller {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private List<Item> itemsSold;
}
