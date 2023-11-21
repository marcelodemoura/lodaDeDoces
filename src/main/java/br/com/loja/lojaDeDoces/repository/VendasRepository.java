package br.com.loja.lojaDeDoces.repository;

import br.com.loja.lojaDeDoces.controller.Sales;
import br.com.loja.lojaDeDoces.model.Empresa;
import br.com.loja.lojaDeDoces.model.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long> {







}
