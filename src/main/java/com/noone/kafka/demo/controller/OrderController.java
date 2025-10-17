package com.noone.kafka.demo.controller;

import com.noone.kafka.demo.model.OrderEvent;
import com.noone.kafka.demo.producer.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping
    public String publishOrder(@RequestBody OrderEvent orderEvent) {
        orderProducer.sendOrder(orderEvent);
        return "✅ Order published successfully!";
    }
}

