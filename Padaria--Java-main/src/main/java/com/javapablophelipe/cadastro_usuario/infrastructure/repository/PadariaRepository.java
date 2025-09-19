package com.javapablophelipe.cadastro_usuario.infrastructure.repository;

import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Padaria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PadariaRepository extends MongoRepository<Padaria, String> {
    // findById e deleteById já existem no MongoRepository
}
