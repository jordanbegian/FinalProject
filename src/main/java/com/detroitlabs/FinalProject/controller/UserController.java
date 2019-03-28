package com.detroitlabs.FinalProject.controller;

import com.detroitlabs.FinalProject.model.User;
import com.detroitlabs.FinalProject.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllNotes() {
        return userRepository.findAll();
    }

    @PostMapping("/notes")
    public User createNote(@Valid @RequestBody User note) {
        return userRepository.save(note);
    }
}
