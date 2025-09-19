package com.javapablophelipe.cadastro_usuario.dto;

import lombok.Data;

import java.util.List;
@Data

public class CompraRequestDTO {
    private String usuarioId;
    private List<String> produtosIds;
}
