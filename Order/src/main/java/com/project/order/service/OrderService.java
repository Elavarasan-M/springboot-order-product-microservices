package com.project.order.service;

import com.project.order.dto.CreateOrderRequest;
import com.project.order.dto.ProductResponse;
import com.project.order.entity.Order;
import com.project.order.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;

    public OrderService(OrderRepository orderRepository,
                        RestTemplate restTemplate) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    public Order createOrder(CreateOrderRequest request) {

        // Call Product Service
        String url = "http://localhost:8085/api/v1/products/" + request.getProductId();

        ProductResponse product =
                restTemplate.getForObject(url, ProductResponse.class);

        if (product == null) {
            throw new RuntimeException("Product not found");
        }

        Order order = new Order();

        order.setCustomerName(request.getCustomerName());
        order.setProductId(product.getProductId());
        order.setProductName(product.getProductName());
        order.setPrice(product.getPrice());
        order.setQuantity(request.getQuantity());

        double totalPrice =
                product.getPrice() * request.getQuantity();

        order.setTotalPrice(totalPrice);

        return orderRepository.save(order);
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found"));
    }
}