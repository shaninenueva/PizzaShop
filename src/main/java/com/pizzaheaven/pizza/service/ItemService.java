package com.pizzaheaven.pizza.service;

import com.pizzaheaven.pizza.models.Item;
import com.pizzaheaven.pizza.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepo;

    @Autowired
    public ItemService(ItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    public List<Item> findAllItems() {
        return itemRepo.findAll();
    }

    public void addItems(List<Item> items){
        items.forEach(item -> {
            itemRepo.save(item);
        });

    }
}
