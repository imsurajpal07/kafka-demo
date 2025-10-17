package com.noone.kafka.demo.consumer;

import com.noone.kafka.demo.model.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "order-events", groupId = "order-event-group")
    public void consume(OrderEvent event) {
        System.out.println("📥 Consumed order: " + event);
    }
}

