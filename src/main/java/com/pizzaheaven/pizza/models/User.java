package com.pizzaheaven.pizza.models;

import javax.persistence.*;

@Entity
@Table(name="Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String type;
    private String street;
    private String suburb;
    private String city;
    private int postCode;

}
