package br.com.dio.api_rest.service.Impl;

import br.com.dio.api_rest.domain.model.User;
import br.com.dio.api_rest.domain.repository.UserRepository;
import br.com.dio.api_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {

        if (userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("This User ID already exists");
        }

        return userRepository.save(userToCreate);
    }
}
