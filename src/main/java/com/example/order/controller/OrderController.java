package com.example.order.controller;

import com.example.order.dto.Order;
import com.example.order.service.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

  private final OrderProducer orderProducer;

  @PostMapping("/makeOrder")
  public ResponseEntity makeOrder(@RequestBody Order order) {
    orderProducer.sendOrderEvent(order);
    return ResponseEntity.ok("Order created");
  }
}
