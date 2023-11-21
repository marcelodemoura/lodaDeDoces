package br.com.loja.lojaDeDoces.service.serviceImpl;

import br.com.loja.lojaDeDoces.model.Pagamento;
import br.com.loja.lojaDeDoces.repository.PagamentoRepository;
import br.com.loja.lojaDeDoces.service.PagamanentoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PagamentoServiceImpl implements PagamanentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoServiceImpl(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public Object save(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);

    }

    @Override
    public Optional<Pagamento> findById(Long id) {
        return pagamentoRepository.findById(id);
    }

    @Override
    public Pagamento findAll() {
        return null;
    }


    @Override
    public void delete(Pagamento pagamento) {
        pagamentoRepository.delete(pagamento);

    }
}




