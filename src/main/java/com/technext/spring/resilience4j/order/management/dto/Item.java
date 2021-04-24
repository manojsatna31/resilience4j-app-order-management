package com.technext.spring.resilience4j.order.management.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Item {
    private long id;
    private String name;
    private String category;
    private double price;//per item
}
