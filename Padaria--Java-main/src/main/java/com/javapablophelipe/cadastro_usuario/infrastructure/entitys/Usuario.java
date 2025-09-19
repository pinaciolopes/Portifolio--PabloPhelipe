package com.javapablophelipe.cadastro_usuario.infrastructure.entitys;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "usuarios") // Define a coleção no Mongo
public class Usuario {

    @Id
    private String id; // Mongo usa String/ObjectId como ID

    private String nome;

    @Indexed(unique = true) // garante que o CPF seja único
    private String cpf;

    private String email;
    private LocalDate dataNascimento;
    private String telefone;
}

