package com.javapablophelipe.cadastro_usuario.controller;

import com.javapablophelipe.cadastro_usuario.dto.RegisterDTO;
import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.User;
import com.javapablophelipe.cadastro_usuario.infrastructure.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterDTO data) {
        if (repository.findByUsername(data.login()) != null) {
            return ResponseEntity.badRequest().body("Usuário já existente");
        }

        User newUser = new User();
        newUser.setUsername(data.login());
        newUser.setPassword(passwordEncoder.encode(data.password()));
        newUser.setRole(data.role());
        newUser.setEnabled(true);

        repository.save(newUser);

        return ResponseEntity.ok(newUser);
    }
}
