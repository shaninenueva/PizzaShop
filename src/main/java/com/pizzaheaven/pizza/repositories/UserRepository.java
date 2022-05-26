package com.pizzaheaven.pizza.repositories;

import com.pizzaheaven.pizza.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
