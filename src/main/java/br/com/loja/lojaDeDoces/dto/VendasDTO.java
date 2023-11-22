package br.com.loja.lojaDeDoces.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VendasDTO {


    private Long id;
    private String tp_doces;
    private int qtde;
    private BigDecimal v_Total;
    private String cliente;
    private String f_Pagamento;
    private BigDecimal v_Pago;
    private boolean Pago;

}
