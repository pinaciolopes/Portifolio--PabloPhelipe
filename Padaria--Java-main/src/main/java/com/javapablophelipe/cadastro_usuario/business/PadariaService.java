package com.javapablophelipe.cadastro_usuario.business;

import com.javapablophelipe.cadastro_usuario.infrastructure.entitys.Padaria;
import com.javapablophelipe.cadastro_usuario.infrastructure.repository.PadariaRepository;
import org.springframework.stereotype.Service;

@Service
public class PadariaService {

    private final PadariaRepository repository;

    public PadariaService(PadariaRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(Padaria padaria) {
        repository.save(padaria); // Mongo salva direto
    }

    public Padaria buscarProdutoPorId(String id) {
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto não encontrado")
        );
    }

    public void deletarProdutoPorId(String id) {
        repository.deleteById(id);
    }

    public void atualizarProdutoPorId(String id, Padaria padaria) {
        Padaria padariaEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto não encontrado")
        );

        Padaria produtoAtualizado = Padaria.builder()
                .id(padariaEntity.getId()) // mantém o mesmo id do Mongo
                .nome(padaria.getNome() != null ? padaria.getNome() : padariaEntity.getNome())
                .preco(padaria.getPreco() != null ? padaria.getPreco() : padariaEntity.getPreco())
                .build();

        repository.save(produtoAtualizado); // substitui saveAndFlush
    }
}
