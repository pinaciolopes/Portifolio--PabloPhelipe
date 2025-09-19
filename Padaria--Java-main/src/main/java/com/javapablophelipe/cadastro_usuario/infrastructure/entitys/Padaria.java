package com.javapablophelipe.cadastro_usuario.infrastructure.entitys;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Document(collection = "padaria") // Nome da coleção no MongoDB
public class Padaria {

    @Id
    private String id; // Mongo usa String para o ObjectId

    private String nome;
    private Double preco;
}

