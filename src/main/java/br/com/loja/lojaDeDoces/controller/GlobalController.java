//package br.com.loja.lojaDeDoces.controller;
//
//import br.com.loja.lojaDeDoces.model.Cliente;
//import br.com.loja.lojaDeDoces.service.GlobalService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/loja")
//public class GlobalController {
//
//    private final GlobalService globalService;
//
//    public GlobalController(GlobalService globalService) {
//        this.globalService = globalService;
//    }
//
//    @GetMapping("/{cliente/id}")
//    ResponseEntity<Cliente> findById(@PathVariable Long id) {
//        var cliente = clienteService.findById(id);
//        return ResponseEntity.ok(cliente);
//    }
//    @GetMapping("/{id/list}")
//    ResponseEntity<Cliente> findAll(@PathVariable Long id) {
//        var cliente = clienteService.findAll(id);
//        return ResponseEntity.ok(cliente);
//    }
//
//
//    }
