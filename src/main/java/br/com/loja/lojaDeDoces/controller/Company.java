package br.com.loja.lojaDeDoces.controller;

import br.com.loja.lojaDeDoces.dto.EmpresaDTO;
import br.com.loja.lojaDeDoces.model.Empresa;
import br.com.loja.lojaDeDoces.service.EmpresaService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class Company {

    private final EmpresaService empresaService;

    public Company(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }


    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid EmpresaDTO empresaDTO) {
        var empresa = new Empresa();
        BeanUtils.copyProperties(empresaDTO, empresa);
        empresa.setDatacadastro(empresa.getDatacadastro());
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaService.save(empresa));
    }

    @GetMapping("/{id}")
    ResponseEntity<Optional<Empresa>> findById(@PathVariable Long id) {
        var empresa = empresaService.findById(id);
        return ResponseEntity.ok(empresa);
    }

    @PutMapping("/{id}")
    ResponseEntity<Object> update(@PathVariable(value = "id") Long id,
                                  @RequestBody @Valid EmpresaDTO empresaDTO) {
        Optional<Empresa> empresaOptional = empresaService.findById(id);
        var empresa = new Empresa();
        BeanUtils.copyProperties(empresaDTO, empresa);
        empresa.setId(empresaOptional.get().getId());
        empresa.setDataAtualizacao(empresaOptional.get().getDataAtualizacao());
        return ResponseEntity.status(HttpStatus.OK).body(empresaService.save(empresa));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Object> delete(@PathVariable(value = "id") Long id) {
        Optional<Empresa> empresaOptional = empresaService.findById(id);
        empresaService.delete(empresaOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Successfully");
    }
}
