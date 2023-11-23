package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Vendas;

import java.util.List;
import java.util.Optional;

public interface VendasService {

    Object save(Vendas vendas);

    Optional<Vendas> findById(Long id);

    void delete(Vendas vendas);

    List findAllByCliente(String nome);
}
