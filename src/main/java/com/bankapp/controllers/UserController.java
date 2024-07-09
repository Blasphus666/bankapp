// UserController.java
package com.bankapp.controllers;

import com.bankapp.models.Account;
import com.bankapp.models.User;
import com.bankapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable Long id) {
        // Implementación para obtener usuario por ID
        return "User details for ID: " + id;
    }
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userService.save(user);
    }

    @GetMapping("/{username}/accounts")
    public ResponseEntity<List<Account>> getUserAccounts(@PathVariable String username) {
        User user = userService.findByUsername(username);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user.getAccounts());
    }
}
