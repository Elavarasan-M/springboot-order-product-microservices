package com.project.order.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderRequest {

    private String customerName;

    private Long productId;

    private int quantity;
}