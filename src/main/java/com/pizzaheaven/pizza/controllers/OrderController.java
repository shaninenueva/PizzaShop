package com.pizzaheaven.pizza.controllers;

import com.pizzaheaven.pizza.models.Order;
import com.pizzaheaven.pizza.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getOrder(){
        return orderRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createOrder(@RequestBody Order order){

    }

    @GetMapping("/{id}")
    public Order get(@PathVariable("id") long id){
        return new Order();
    }
}
