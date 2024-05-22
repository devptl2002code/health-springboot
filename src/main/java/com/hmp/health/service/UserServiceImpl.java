package com.hmp.health.service;

import com.hmp.health.model.User;
import com.hmp.health.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User insert(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void delete(int id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User findById(int id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public User updateUser(int id, User user) {
        user.setId(id);
        return this.userRepository.save(user);
    }
}
