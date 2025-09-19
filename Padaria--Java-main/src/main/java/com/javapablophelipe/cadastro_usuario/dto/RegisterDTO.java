package com.javapablophelipe.cadastro_usuario.dto;

import com.javapablophelipe.cadastro_usuario.role.UserRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterDTO(
        @NotBlank String login,
        @NotBlank String password,
        @NotNull UserRole role
) {}
