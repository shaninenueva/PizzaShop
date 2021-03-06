package com.pizzaheaven.pizza.repositories;

import com.pizzaheaven.pizza.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
