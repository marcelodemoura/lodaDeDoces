package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Produto;

import java.util.Optional;

public interface ProdutoService {
    Object save(Produto produto);

    Optional<Produto> findById(Long id);
    Produto findAll();

    void delete(Produto produto);

}
