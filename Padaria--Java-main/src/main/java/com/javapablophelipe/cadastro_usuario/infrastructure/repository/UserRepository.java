package com.javapablophelipe.cadastro_usuario.infrastructure.repository;

import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
}

