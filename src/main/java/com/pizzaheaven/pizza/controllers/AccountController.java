package com.pizzaheaven.pizza.controllers;

import com.pizzaheaven.pizza.models.Person;
import com.pizzaheaven.pizza.models.Pizza;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping
    public Person getAccount(){
        Person person = new Person(1, "Sam Smith", "Null");
        return person;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Pizza pizza){

    }



}