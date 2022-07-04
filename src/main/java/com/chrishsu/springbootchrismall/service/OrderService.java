package com.chrishsu.springbootchrismall.service;

import com.chrishsu.springbootchrismall.dto.CreateOrderRequest;
import com.chrishsu.springbootchrismall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
