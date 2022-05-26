package com.pizzaheaven.pizza.repositories;

import com.pizzaheaven.pizza.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
