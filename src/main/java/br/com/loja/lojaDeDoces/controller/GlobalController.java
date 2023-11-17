package br.com.loja.lojaDeDoces.controller;

import br.com.loja.lojaDeDoces.dto.ClienteDTO;
import br.com.loja.lojaDeDoces.dto.EmpresaDTO;
import br.com.loja.lojaDeDoces.model.Cliente;
import br.com.loja.lojaDeDoces.model.Empresa;
import br.com.loja.lojaDeDoces.service.GlobalService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/loja")
public class GlobalController {

    private final GlobalService globalService;

    public GlobalController(GlobalService globalService) {
        this.globalService = globalService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ClienteDTO clienteDTO) {
        var cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO, cliente);
        cliente.setDatacadastro(cliente.getDatacadastro());
        return ResponseEntity.status(HttpStatus.CREATED).body(globalService.save(cliente));
    }
    @GetMapping("/{id}")
    ResponseEntity<Optional<Cliente>> findById(@PathVariable Long id) {
        var cliente = globalService.findById(id);
        return ResponseEntity.ok(cliente);
    }
    @PutMapping("/{id}")
    ResponseEntity<Object> update(@PathVariable(value = "id") Long id,
                                  @RequestBody @Valid ClienteDTO clienteDTO) {
        Optional<Cliente> clienteOptional = globalService.findById(id);
        var cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO, cliente);
        cliente.setId(clienteOptional.get().getId());
        cliente.setDataAtualizacao(clienteOptional.get().getDataAtualizacao());
        return ResponseEntity.status(HttpStatus.OK).body(globalService.save(cliente));
    }
    @DeleteMapping("/{id}")
    ResponseEntity<Object> delete(@PathVariable(value = "id") Long id) {
        Optional<Cliente> clienteOptional = globalService.findById(id);
        globalService.delete(clienteOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Successfully");
    }
}
