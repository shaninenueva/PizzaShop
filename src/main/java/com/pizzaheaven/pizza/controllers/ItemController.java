package com.pizzaheaven.pizza.controllers;

import com.pizzaheaven.pizza.models.Pizza;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
    @GetMapping
    public ArrayList<Pizza> pizzaList(){
        ArrayList<Pizza> pizza = new ArrayList<>();
        return pizza;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Pizza pizza){

    }



}
