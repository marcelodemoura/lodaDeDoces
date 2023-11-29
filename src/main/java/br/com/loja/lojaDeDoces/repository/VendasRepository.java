package br.com.loja.lojaDeDoces.repository;

import br.com.loja.lojaDeDoces.model.Vendas;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long> {

    List<Vendas> findAllByCliente(String nome);


}
