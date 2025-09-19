package com.javapablophelipe.cadastro_usuario.infrastructure.entitys;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "compras")
public class Compra {

    @Id
    private String id; // MongoDB usa String/ObjectId

    @DBRef
    private Usuario usuario; // referência para usuário

    @DBRef
    private List<Padaria> produtos; // referência para produtos

    private LocalDateTime dataCompra;
    private Double valorTotal;
}
