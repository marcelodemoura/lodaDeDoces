package br.com.loja.lojaDeDoces.service.serviceImpl;

import br.com.loja.lojaDeDoces.model.Cliente;
import br.com.loja.lojaDeDoces.model.Empresa;
import br.com.loja.lojaDeDoces.repository.ClienteRepository;
import br.com.loja.lojaDeDoces.repository.EmpresaRepository;
import br.com.loja.lojaDeDoces.service.EmpresaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Override
    public Object save(Empresa empresa) {
        return null;
    }

    @Override
    public Optional<Empresa> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Empresa findAll() {
        return null;
    }

    @Override
    public void delete(Empresa empresa) {

    }



}
