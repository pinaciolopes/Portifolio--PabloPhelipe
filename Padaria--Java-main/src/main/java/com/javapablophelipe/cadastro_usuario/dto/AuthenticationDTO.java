package com.javapablophelipe.cadastro_usuario.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthenticationDTO(
        @NotBlank String login,
        @NotBlank String senha
) {}
