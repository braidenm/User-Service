package com.braidenmiller.userservice.controller;

import com.braidenmiller.userservice.dao.UserEntity;
import com.braidenmiller.userservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserEntity> getAll() {
        return userService.getAllUsers();
    }
}

