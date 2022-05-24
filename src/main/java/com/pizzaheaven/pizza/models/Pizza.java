package com.pizzaheaven.pizza.models;

import java.util.ArrayList;

public class Pizza {
    private int pizzaID;
    private String size;
    private String base;
    private ArrayList<String> topping;
    private double price;

    public Pizza(int pizzaID, String size, String base, ArrayList<String> topping, double price) {
        this.pizzaID = pizzaID;
        this.size = size;
        this.base = base;
        this.topping = topping;
        this.price = price;
    }
}
