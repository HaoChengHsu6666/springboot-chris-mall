package com.chrishsu.springbootchrismall.dao;

import com.chrishsu.springbootchrismall.dto.OrderQueryParams;
import com.chrishsu.springbootchrismall.model.Order;
import com.chrishsu.springbootchrismall.model.OrderItem;

import java.util.List;


public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
