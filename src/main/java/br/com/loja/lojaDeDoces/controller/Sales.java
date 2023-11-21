package br.com.loja.lojaDeDoces.controller;

import br.com.loja.lojaDeDoces.dto.VendasDTO;
import br.com.loja.lojaDeDoces.model.Vendas;
import br.com.loja.lojaDeDoces.service.VendasService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
@RestController
@RequestMapping("/vendas")
public class Sales {

    private final VendasService vendasService;

    public Sales(VendasService vendasService) {
        this.vendasService = vendasService;
    }


    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid VendasDTO vendasDTO) {
        var vendas = new Vendas();
        BeanUtils.copyProperties(vendasDTO, vendas);
        vendas.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(vendasService.save(vendas));
    }

    @GetMapping("/{id}")
    ResponseEntity<Optional<Vendas>> findById(@PathVariable Long id) {
        var vendas = vendasService.findById(id);
        return ResponseEntity.ok(vendas);
    }

    @PutMapping("/{id}")
    ResponseEntity<Object> update(@PathVariable(value = "id") Long id,
                                  @RequestBody @Valid VendasDTO vendasDTO) {
        Optional<Vendas> vendasOptional = vendasService.findById(id);
        var vendas = new Vendas();
        BeanUtils.copyProperties(vendasDTO, vendas);
        vendas.setId(vendasOptional.get().getId());
        vendas.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.OK).body(vendasService.save(vendas));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Object> delete(@PathVariable(value = "id") Long id) {
        Optional<Vendas> vendasOptional = vendasService.findById(id);
        vendasService.delete(vendasOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Successfully");
    }

}
