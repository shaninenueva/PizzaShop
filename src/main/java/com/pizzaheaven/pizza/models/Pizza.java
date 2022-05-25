package com.pizzaheaven.pizza.models;

import java.util.ArrayList;

public class Pizza {
    private String flavour;
    private String size;
    private String base;
    private int quantity;
    private ArrayList<String> topping;
    private double price;

    public Pizza(String flavour, String size, String base, int quantity, ArrayList<String> topping, double price) {
        this.flavour = flavour;
        this.size = size;
        this.base = base;
        this.quantity = quantity;
        this.topping = topping;
        this.price = price;
    }
}
