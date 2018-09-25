package pro.ofitserov.example.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pro.ofitserov.example.spring.security.entity.User;
import pro.ofitserov.example.spring.security.service.UserService;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "Index page " + System.lineSeparator() + System.currentTimeMillis();
    }

    @PostMapping(path = "/new", consumes = "application/json")
    public User createUser(@Validated @RequestBody User user) {
        return userService.createUser(user);
    }
}