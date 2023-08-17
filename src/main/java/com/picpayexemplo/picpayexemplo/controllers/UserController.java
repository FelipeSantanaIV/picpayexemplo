package com.picpayexemplo.picpayexemplo.controllers;

import com.picpayexemplo.picpayexemplo.domain.user.User;
import com.picpayexemplo.picpayexemplo.dtos.UserDTO;
import com.picpayexemplo.picpayexemplo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping
    public ResponseEntity<User> createUser(UserDTO user){
        User newUser = userServices.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAlluser(){
        List<User> users =  this.userServices.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
