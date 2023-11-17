package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Cliente;

import java.util.Optional;

public interface GlobalService {


    Object save(Cliente cliente);
    Optional<Cliente> findById(Long id);
    Cliente findAll(Cliente cliente);

}
