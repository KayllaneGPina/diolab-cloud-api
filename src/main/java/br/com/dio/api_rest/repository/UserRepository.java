package br.com.dio.api_rest.repository;

import br.com.dio.api_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
