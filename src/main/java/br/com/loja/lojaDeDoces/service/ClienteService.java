package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Cliente;

import java.util.Optional;

public interface ClienteService {


    Object save(Cliente cliente);

    Optional<Cliente> findById(Long id);


    Cliente findAll();

    void delete(Cliente cliente);

}
