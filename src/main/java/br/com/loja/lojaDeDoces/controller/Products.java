package br.com.loja.lojaDeDoces.controller;

import br.com.loja.lojaDeDoces.dto.ProdutoDTO;
import br.com.loja.lojaDeDoces.model.Produto;
import br.com.loja.lojaDeDoces.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/produtos")
public class Products {

    private final ProdutoService produtoService;

    public Products(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ProdutoDTO produtoDTO) {
        var produto = new Produto();
        BeanUtils.copyProperties(produtoDTO, produto);
        produto.setDatacadastro(produto.getDatacadastro());
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produto));
    }

    @GetMapping("/{id}")
    ResponseEntity<Optional<Produto>> findById(@PathVariable Long id) {
        var produto = produtoService.findById(id);
        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    ResponseEntity<Object> update(@PathVariable(value = "id") Long id,
                                  @RequestBody @Valid ProdutoDTO produtoDTO) {
        Optional<Produto> produtoOptional = produtoService.findById(id);
        var produto = new Produto();
        BeanUtils.copyProperties(produtoDTO, produto);
        produto.setId(produtoOptional.get().getId());
        produto.setDataAtualizacao(produtoOptional.get().getDataAtualizacao());
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.save(produto));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Object> delete(@PathVariable(value = "id") Long id) {
        Optional<Produto> produtoOptional = produtoService.findById(id);
        produtoService.delete(produtoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Successfully");
    }

}
