package com.pizzaheaven.pizza.repositories;

import com.pizzaheaven.pizza.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findOrderByOrderNumber(String orderNumber);
}
