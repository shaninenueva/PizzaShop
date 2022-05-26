package com.pizzaheaven.pizza.service;

import com.pizzaheaven.pizza.exception.UserNotFoundException;
import com.pizzaheaven.pizza.models.User;
import com.pizzaheaven.pizza.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User findUserByUserID(Long id){
        return userRepo.findUserByUserID(id).orElseThrow(() -> new UserNotFoundException("User id " + id + " was not found"));
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }


}
