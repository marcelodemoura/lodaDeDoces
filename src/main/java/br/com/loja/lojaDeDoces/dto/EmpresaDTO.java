package br.com.loja.lojaDeDoces.dto;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class EmpresaDTO {
    private Long id;
    private String nome;
    private Boolean status = true;



}
