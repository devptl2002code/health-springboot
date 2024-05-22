package com.hmp.health.controller;


import com.hmp.health.model.User;
import com.hmp.health.service.IUserService;
import com.hmp.health.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public User saveUser (@RequestBody User user){
        return  this.userService.insert(user);
    }


}
