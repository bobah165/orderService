package com.example.order.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
  private String orderId;
  private Long price;
  private String name;
  private String userId;
}
