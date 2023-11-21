package br.com.loja.lojaDeDoces.service.serviceImpl;

import br.com.loja.lojaDeDoces.model.Empresa;
import br.com.loja.lojaDeDoces.repository.EmpresaRepository;
import br.com.loja.lojaDeDoces.service.EmpresaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(EmpresaRepository empresaRepositor) {
        this.empresaRepository = empresaRepositor;
    }


    @Override
    public Object save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Optional<Empresa> findById(Long id) {
        return empresaRepository.findById(id);
    }

    @Override
    public Empresa findAll() {
        return null;
    }

    @Override
    public void delete(Empresa empresa) {


    }
}
