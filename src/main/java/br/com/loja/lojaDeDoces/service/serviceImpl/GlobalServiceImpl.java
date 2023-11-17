package br.com.loja.lojaDeDoces.service.serviceImpl;

import br.com.loja.lojaDeDoces.model.Cliente;
import br.com.loja.lojaDeDoces.repository.GlobalRepository;
import br.com.loja.lojaDeDoces.service.GlobalService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GlobalServiceImpl implements GlobalService {
    private final GlobalRepository globalRepository;

    public GlobalServiceImpl(GlobalRepository globalRepository) {
        this.globalRepository = globalRepository;
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return globalRepository.findById(id);
    }

    @Override
    public Cliente findAll() {
        return null;
    }

    @Override
    public void delete(Cliente cliente) {
        globalRepository.delete(cliente);
    }

    @Override
    public Object save(Cliente cliente) {
        return globalRepository.save(cliente);
    }
}
