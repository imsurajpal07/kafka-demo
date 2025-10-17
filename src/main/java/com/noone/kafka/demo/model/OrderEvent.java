package com.noone.kafka.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OrderEvent {
    private String orderId;
    private String product;
    private int quantity;
    private double price;
}

