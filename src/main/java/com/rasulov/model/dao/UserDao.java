package com.rasulov.model.dao;

import com.rasulov.model.User;

import java.util.Collection;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User findByUserName(String name);

    void addUser(User user);

    void delete(User user);

    void update(User user);
}
