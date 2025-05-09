package me.dio.projetoApiRest.service;

import me.dio.projetoApiRest.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
