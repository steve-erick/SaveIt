package com.erick.financas_pessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erick.financas_pessoal.model.User;
import com.erick.financas_pessoal.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

     @GetMapping 
    public List<User> getAll(){return userService.getAll();}

    @PostMapping
    public User create(@RequestBody User user){ return userService.save(user);} 

    @PutMapping
    public User update(@RequestBody User user){ return userService.update(user);} 

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) { userService.delete(id);return ResponseEntity.noContent().build();} 

}
