package br.com.loja.lojaDeDoces.service.serviceImpl;

import br.com.loja.lojaDeDoces.model.Vendas;
import br.com.loja.lojaDeDoces.repository.VendasRepository;
import br.com.loja.lojaDeDoces.service.VendasService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VendasServiceImpl implements VendasService {

    private final VendasRepository vendasRepository;

    public VendasServiceImpl(VendasRepository vendasRepository) {
        this.vendasRepository = vendasRepository;
    }

    @Override
    public Object save(Vendas vendas) {
        return vendasRepository.save(vendas);
    }

    @Override
    public Optional<Vendas> findById(Long id) {
        return vendasRepository.findById(id);

    }

//        @Override
//    public Vendas findAll() {
//        return null;
//    }
    @Override
    public void delete(Vendas vendas) {
        vendasRepository.delete(vendas);

    }


}
