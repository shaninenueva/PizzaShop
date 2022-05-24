package com.pizzaheaven.pizza.models;

public class Person {
    private int id;
    private String name;
    private String deliveryAddress;

    public Person(int id, String name, String deliveryAddress) {
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
    }
}
