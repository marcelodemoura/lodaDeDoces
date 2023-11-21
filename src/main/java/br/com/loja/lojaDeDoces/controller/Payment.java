package br.com.loja.lojaDeDoces.controller;

import br.com.loja.lojaDeDoces.dto.PagamentoDTO;
import br.com.loja.lojaDeDoces.model.Pagamento;
import br.com.loja.lojaDeDoces.service.PagamanentoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
@RestController
@RequestMapping("/pagamento")
public class Payment {

    private final PagamanentoService pagamanentoService;

    public Payment(PagamanentoService pagamanentoService) {
        this.pagamanentoService = pagamanentoService;
    }


    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid PagamentoDTO pagamentoDTO) {
        var pagamento = new Pagamento();
        BeanUtils.copyProperties(pagamentoDTO, pagamento);
        pagamento.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(pagamanentoService.save(pagamento));
    }

    @GetMapping("/{id}")
    ResponseEntity<Optional> findById(@PathVariable Long id) {
        var pagamento = pagamanentoService.findById(id);
        return ResponseEntity.ok(pagamento);
    }

    @PutMapping("/{update}")
    ResponseEntity<Object> update(@PathVariable(value = "id") Long id,
                                  @RequestBody @Valid PagamentoDTO pagamentoDTO) {
        Optional<Pagamento> pagamentoOptional = pagamanentoService.findById(id);
        var pagamento = new Pagamento();
        BeanUtils.copyProperties(pagamentoDTO, pagamento);
        pagamento.setId(pagamentoOptional.get().getId());
        pagamento.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.OK).body(pagamanentoService.save(pagamento));
    }


    @DeleteMapping("/{id}")
    ResponseEntity<Object> delete(@PathVariable(value = "id") Long id) {
        Optional<Pagamento> pagamentoOptional = pagamanentoService.findById(id);
        pagamanentoService.delete(pagamentoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Successfully");
    }

}
