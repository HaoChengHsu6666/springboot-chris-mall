package com.chrishsu.springbootchrismall.service.impl;

import com.chrishsu.springbootchrismall.dao.OrderDao;
import com.chrishsu.springbootchrismall.dao.ProductDao;
import com.chrishsu.springbootchrismall.dto.BuyItem;
import com.chrishsu.springbootchrismall.dto.CreateOrderRequest;
import com.chrishsu.springbootchrismall.model.Order;
import com.chrishsu.springbootchrismall.model.OrderItem;
import com.chrishsu.springbootchrismall.model.Product;
import com.chrishsu.springbootchrismall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Order getOrderById(Integer orderId) {
        Order order = orderDao.getOrderById(orderId);

        List<OrderItem> orderItemList = orderDao.getOrderItemsByOrderId(orderId);

        //至Order Model設計出orderItemList，以便將訂單物品清單插入至訂單中
        order.setOrderItemList(orderItemList);

        return order;
    }

    @Transactional //加入此註解，使createOrder與createOrderItem能同時成立或同時回朔，避免數據不一致
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest){

        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for (BuyItem buyItem : createOrderRequest.getBuyItemList()){
            Product product = productDao.getProductById(buyItem.getProductId());

            //計算總價錢
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount = totalAmount + amount;

            //轉換 BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        //創建訂單
        Integer orderId = orderDao.createOrder(userId, totalAmount);

        orderDao.createOrderItems(orderId, orderItemList);

        return orderId;
    }
}
