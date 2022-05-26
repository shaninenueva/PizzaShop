package com.pizzaheaven.pizza.controllers;

import com.pizzaheaven.pizza.models.User;
import com.pizzaheaven.pizza.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createAccount(@RequestBody User user){
        userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable("id") int id){
        return userRepository.getReferenceById(id);
    }

}