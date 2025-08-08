package com.vitorEduardoGarcia.designPatterns_DIO.service;

import com.vitorEduardoGarcia.designPatterns_DIO.model.User;

public interface UserService {

    Iterable<User> findAll();

    User findById(Long id);

    void save(User user);

    void update(Long id, User user);

    void delete(Long id);
}