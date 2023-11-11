package com.example.cms.controller;

import com.example.cms.controller.exceptions.UserNotFoundException;
import com.example.cms.model.entity.Management;
import com.example.cms.model.entity.User;
import com.example.cms.model.repository.UserRepository;
import org.hibernate.service.UnknownServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<User> retrieveAllUsers() {
        return repository.findAll();
    }

    @PostMapping("/users")
    User createUser(@RequestBody User newUser) {
        return repository.save(newUser);
    }

    @GetMapping("/users/{id}")
    User retrieveUser(@PathVariable("id") Long userId) {
        return repository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId)); //change exception
    }

    @PutMapping("/users/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable("id") Long userId) {
        return repository.findById(userId)
                .map(user -> {
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(userId);
                    return repository.save(newUser);
                });
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable("id") Long userId) {
        repository.deleteById(userId);
    }

    @GetMapping("/users/search/{searchstring}")
    List<User> searchUser(@PathVariable("searchstring") String searchString) {
        return repository.search(searchString);
    }

}
