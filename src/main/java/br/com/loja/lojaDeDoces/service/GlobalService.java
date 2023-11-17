package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Cliente;

import java.util.Optional;

public interface GlobalService {


    Object save(Cliente cliente);

    Optional<Cliente> findById(Long id);


    Cliente findAll();

    void delete(Cliente cliente);
//
//    Object save(Empresa empresa);
//    Optional<Empresa> findById(Long id);
//
//
////    Cliente findAll();
//
//    void delete(Empresa empresa);
}
