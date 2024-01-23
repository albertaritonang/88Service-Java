package com.springboot.bengkel.controller;

import com.springboot.bengkel.model.User;
import com.springboot.bengkel.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> list() {
        return userService.listAllUser();
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<User> get(@PathVariable Integer user_id) {
        try {
            User user = userService.getUser(user_id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("/{user_id}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer user_id) {
        try {
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{user_id}")
    public void delete(@PathVariable Integer user_id) {
        userService.deleteUser(user_id);
    }
}
