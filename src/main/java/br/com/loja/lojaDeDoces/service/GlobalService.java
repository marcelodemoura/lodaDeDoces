package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.dto.ClienteDTO;
import br.com.loja.lojaDeDoces.model.Cliente;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface GlobalService {


    Object save(Cliente cliente);

    Optional<Cliente> findById(Long id);


    Cliente findAll();

    void delete(Cliente cliente);
}
