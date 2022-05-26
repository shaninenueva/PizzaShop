package com.pizzaheaven.pizza.models;

import javax.persistence.*;

@Entity
@Table(name="Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderID;
    private String size;
    private String base;
    private String topping;
    private double price;
    private int quantity;
    private double totalPrice;

}
