package com.pizzaheaven.pizza.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@Table(name="Orders")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderID;
    private int orderNumber;
    private int customerID;
    private double totalAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime orderDateTime;
    private LocalDateTime deliveryDateTime;
    private String status;
    private String deliveryMethod;

}
