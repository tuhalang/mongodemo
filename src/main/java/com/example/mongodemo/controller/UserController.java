package com.example.mongodemo.controller;

import com.example.mongodemo.model.User;
import com.example.mongodemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public Mono<User> createUser(@RequestParam String username,
                                 @RequestParam String password) {
        return userService.createUser(username, password);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Flux<User> getUser() {
        return userService.findAll();
    }
}
