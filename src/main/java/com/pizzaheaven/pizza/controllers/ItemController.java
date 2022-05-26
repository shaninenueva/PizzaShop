package com.pizzaheaven.pizza.controllers;

import com.pizzaheaven.pizza.models.Item;
import com.pizzaheaven.pizza.repositories.ItemRepository;
import com.pizzaheaven.pizza.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAllPizza(){
        return itemRepository.findAll();
    }

    @GetMapping("/{itemID}")
    public Item get(@PathVariable("itemID") Long itemID){
        return itemRepository.getReferenceById(itemID);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addItems(@RequestBody List<Item> items){
        items.forEach(item -> {
            itemRepository.save(item);
        });
    }

}
