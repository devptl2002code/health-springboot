package com.hmp.health.service;

import com.hmp.health.model.User;

import java.util.List;

public interface IUserService {
    public User insert(User user);

    public List<User> findAll();

    public void delete(int id);

    public User findById(int id);

    public User updateUser(int id, User user);
}
