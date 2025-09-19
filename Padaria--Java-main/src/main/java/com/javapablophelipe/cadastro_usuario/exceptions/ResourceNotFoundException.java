package com.javapablophelipe.cadastro_usuario.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String resource, String id) {
        super(resource + " não encontrado com o id " + id);
    }
}
