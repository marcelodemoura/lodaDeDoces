package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Cliente;

public interface GlobalService {

    Cliente findById(Long id);
    Cliente findAll(Cliente cliente);

}
