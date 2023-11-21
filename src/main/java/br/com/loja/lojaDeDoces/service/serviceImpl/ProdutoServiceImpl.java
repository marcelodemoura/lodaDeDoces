package br.com.loja.lojaDeDoces.service.serviceImpl;

import br.com.loja.lojaDeDoces.model.Produto;
import br.com.loja.lojaDeDoces.repository.ProdutoRepository;
import br.com.loja.lojaDeDoces.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @Override
    public Object save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);

    }

    @Override
    public Produto findAll() {
        return null;
    }

    @Override
    public void delete(Produto produto) {
        produtoRepository.delete(produto);

    }
}



