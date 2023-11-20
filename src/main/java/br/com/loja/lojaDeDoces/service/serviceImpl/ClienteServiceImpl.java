package br.com.loja.lojaDeDoces.service.serviceImpl;

import br.com.loja.lojaDeDoces.model.Cliente;
import br.com.loja.lojaDeDoces.repository.ClienteRepository;
import br.com.loja.lojaDeDoces.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository globalRepository;

    public ClienteServiceImpl(ClienteRepository globalRepository) {
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
