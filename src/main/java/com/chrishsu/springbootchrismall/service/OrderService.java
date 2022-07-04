package com.chrishsu.springbootchrismall.service;

import com.chrishsu.springbootchrismall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
