package com.chrishsu.springbootchrismall.service;

import com.chrishsu.springbootchrismall.dto.CreateOrderRequest;
import com.chrishsu.springbootchrismall.dto.OrderQueryParams;
import com.chrishsu.springbootchrismall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
