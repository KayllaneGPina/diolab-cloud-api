package br.com.dio.api_rest.service;

import br.com.dio.api_rest.domain.model.User;


public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
