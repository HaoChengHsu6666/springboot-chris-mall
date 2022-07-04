package com.chrishsu.springbootchrismall.dao;

import com.chrishsu.springbootchrismall.model.OrderItem;

import java.util.List;


public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
