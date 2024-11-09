package com.example.order.service;

import com.example.order.dto.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderProducer {
  private final KafkaMessagingService kafkaMessagingService;;


  public Order sendOrderEvent(Order order) {
    kafkaMessagingService.sendOrder(order);
    log.info("Send order from producer {}", order);
    return order;
  }

}
