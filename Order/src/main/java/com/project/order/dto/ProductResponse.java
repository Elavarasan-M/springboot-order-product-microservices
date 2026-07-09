package com.project.order.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {

    private Long productId;

    private String productName;

    private double price;

    private int quantity;


}