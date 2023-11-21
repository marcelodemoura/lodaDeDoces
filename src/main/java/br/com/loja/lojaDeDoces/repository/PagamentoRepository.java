package br.com.loja.lojaDeDoces.repository;

import br.com.loja.lojaDeDoces.controller.Payment;
import br.com.loja.lojaDeDoces.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
