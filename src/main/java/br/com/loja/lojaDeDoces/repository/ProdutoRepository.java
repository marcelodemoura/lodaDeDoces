package br.com.loja.lojaDeDoces.repository;

import br.com.loja.lojaDeDoces.controller.Products;
import br.com.loja.lojaDeDoces.model.Empresa;
import br.com.loja.lojaDeDoces.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {







}
