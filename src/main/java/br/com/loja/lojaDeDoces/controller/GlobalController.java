package br.com.loja.lojaDeDoces.controller;

import br.com.loja.lojaDeDoces.dto.ClienteDTO;
import br.com.loja.lojaDeDoces.model.Cliente;
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
    public ResponseEntity<Object>save(@RequestBody @Valid ClienteDTO clienteDTO){
        var cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO,cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(globalService.save(cliente));
    }
    @GetMapping("/{id}")
    ResponseEntity<Optional<Cliente>> findById(@PathVariable Long id) {
        var cliente = globalService.findById(id);
        return ResponseEntity.ok(cliente);
    }
//    @GetMapping("/{id/list}")
//    ResponseEntity<Cliente> findAll(@PathVariable Long id) {
//        var cliente = globalService.findAll;
//        return ResponseEntity.ok(cliente);
//    }


}
