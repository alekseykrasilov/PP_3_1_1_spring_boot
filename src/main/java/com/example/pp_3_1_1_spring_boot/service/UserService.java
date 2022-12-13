package com.example.pp_3_1_1_spring_boot.service;

import com.example.pp_3_1_1_spring_boot.models.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void deleteById(Long id);

    public User findById(Long id);
}
