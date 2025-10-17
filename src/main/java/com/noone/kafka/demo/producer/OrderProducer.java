package com.noone.kafka.demo.producer;

import com.noone.kafka.demo.model.OrderEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    private static final String TOPIC = "order-events";
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public OrderProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrder(OrderEvent event) {
        kafkaTemplate.send(TOPIC, event.getOrderId(), event);
        System.out.println("✅ Order sent to Kafka: " + event);
    }
}
