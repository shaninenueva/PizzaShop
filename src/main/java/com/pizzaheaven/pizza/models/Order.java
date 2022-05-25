package com.pizzaheaven.pizza.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderID;
    private ArrayList<Pizza> items;
    private double totalAmount;
    private LocalDateTime orderDateTime;
    private LocalDateTime deliveryDateTime;
    private Person person;
    private String status;
    private String deliveryMethod;

    public Order(Long orderID, ArrayList<Pizza> items, double totalAmount, LocalDateTime orderDateTime, LocalDateTime deliveryDateTime, Person person, String status, String deliveryMethod) {
        this.orderID = orderID;
        this.items = items;
        this.totalAmount = totalAmount;
        this.orderDateTime = orderDateTime;
        this.deliveryDateTime = deliveryDateTime;
        this.person = person;
        this.status = status;
        this.deliveryMethod = deliveryMethod;
    }

    public Order() {

    }
}
