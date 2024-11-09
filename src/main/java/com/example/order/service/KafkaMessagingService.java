package com.example.order.service;

import com.example.order.dto.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessagingService {

  @Value("${topic.send-order}")
  private String sendClientTopic;

  private final KafkaTemplate<String , Object> kafkaTemplate;

  public void sendOrder(Order orderSendEvent) {
    kafkaTemplate.send(sendClientTopic, orderSendEvent.getOrderId(), orderSendEvent);
  }
}
