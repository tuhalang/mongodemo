package com.example.mongodemo.service;

import com.example.mongodemo.model.User;
import com.example.mongodemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public Mono<User> createUser(String username, String password) {
        return userRepository.save(User.builder()
                .username(username)
                .password(password)
                .build());
    }

    public Flux<User> findAll() {
        return userRepository.findAll();
    }
}
