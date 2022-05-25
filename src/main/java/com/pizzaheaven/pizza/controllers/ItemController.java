package com.pizzaheaven.pizza.controllers;

import com.pizzaheaven.pizza.models.Item;
import com.pizzaheaven.pizza.repositories.ItemRepository;
import com.pizzaheaven.pizza.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pizza")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public ArrayList<Item> getAllPizza(){
        ArrayList<Item> items = new ArrayList<>();
        return items;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Item item){
        itemRepository.save(item);
    }



}
