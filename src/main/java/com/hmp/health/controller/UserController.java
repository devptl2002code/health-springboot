package com.hmp.health.controller;


import com.hmp.health.model.User;
import com.hmp.health.service.IUserService;
import com.hmp.health.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> findAllUsers(){
        return this.userService.findAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public User findById(@PathVariable int id){
        return this.userService.findById(id);
    }


    @PutMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public User updateUser(@PathVariable int id, @RequestBody User user){
        return this.userService.updateUser(id, user);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable int id){
        this.userService.delete(id);
    }


}
