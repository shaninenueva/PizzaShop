package com.pizzaheaven.pizza.service;

import com.pizzaheaven.pizza.exception.OrderNotFoundException;
import org.apache.commons.lang3.RandomStringUtils;
import com.pizzaheaven.pizza.models.Order;
import com.pizzaheaven.pizza.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepo;
    private final int ORDER_NUMBER_LENGTH = 6;

    @Autowired
    public OrderService(OrderRepository orderRepo){
        this.orderRepo = orderRepo;
    }

    public Order addOrder(Order order){
        String orderNumber = RandomStringUtils.randomNumeric(ORDER_NUMBER_LENGTH);
        order.setOrderNumber(orderNumber);
        order.setOrderDateTime(LocalDateTime.now());
//        order.setCustomerID(user.getUserID());
        order.setStatus("Pending");
        return orderRepo.save(order);
    }

    public List<Order> findAllOrders() {
        return orderRepo.findAll();
    }

    public Order updateOrder(Order order){
        return orderRepo.save(order);
    }

    public Order findOrderByOrderNumber(String orderNumber) {
        return orderRepo.findOrderByOrderNumber(orderNumber).orElseThrow(() -> new OrderNotFoundException("Order number " + orderNumber + " was not found"));
    }
}
