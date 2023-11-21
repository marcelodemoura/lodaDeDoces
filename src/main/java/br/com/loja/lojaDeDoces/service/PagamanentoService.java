package br.com.loja.lojaDeDoces.service;

import br.com.loja.lojaDeDoces.model.Pagamento;

import java.util.Optional;

public interface PagamanentoService {

    Object save(Pagamento pagamento);

    Optional<Pagamento> findById(Long id);


    Pagamento findAll();

    void delete(Pagamento pagamento);

}
