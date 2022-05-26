package com.pizzaheaven.pizza.repositories;

import com.pizzaheaven.pizza.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUserID(Long id);
}
