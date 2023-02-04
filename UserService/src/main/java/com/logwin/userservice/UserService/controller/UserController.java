package com.logwin.userservice.UserService.controller;

import com.logwin.userservice.UserService.Dto.UserDto;
import com.logwin.userservice.UserService.entity.User;
import com.logwin.userservice.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    /*@GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }*/

    @GetMapping("/{id}")
    public UserDto getUserWithDepartment(@PathVariable Long id) {
        return userService.getUserWithDepartment(id);
    }


}
