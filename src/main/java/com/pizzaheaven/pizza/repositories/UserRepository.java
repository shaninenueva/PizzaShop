package com.pizzaheaven.pizza.repositories;

import com.pizzaheaven.pizza.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<User, Integer> {
}
