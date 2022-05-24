package com.pizzaheaven.pizza.models;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private ArrayList<Pizza> items;
    private double totalAmount;
    private LocalDateTime orderDateTime;
    private LocalDateTime deliveryDateTime;
    private Person person;
    private String status;
    private String deliveryMethod;

    public Order(int orderID, ArrayList<Pizza> items, double totalAmount, LocalDateTime orderDateTime, LocalDateTime deliveryDateTime, Person person, String status, String deliveryMethod) {
        this.orderID = orderID;
        this.items = items;
        this.totalAmount = totalAmount;
        this.orderDateTime = orderDateTime;
        this.deliveryDateTime = deliveryDateTime;
        this.person = person;
        this.status = status;
        this.deliveryMethod = deliveryMethod;
    }
}
