package br.com.loja.lojaDeDoces.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TP_Doces", nullable = false, length = 25)
    private String tPdoces;
    @Column(name = "Qtde", nullable = false, length = 5)
    private String qtde;
    @Column(name = "Q_Total", nullable = false, length = 5)
    private String vTotal;
    @Column(name = "Cliente", nullable = false, length = 30)
    private String cliente;
    @Column(name = "F_Pagamento", nullable = false, length = 15)
    private String fPagamento;
    @Column(name = "dt_compra", nullable = false, length = 15)
    private String dtCompranto;
    @Column(name = "dt_pagamento", nullable = false, length = 15)
    private String dt_pagamento;
    @Column(name = "V_Pago", nullable = false, length = 5)
    private String vPago;
    @Column(name = "Pago", nullable = false, length = 5)
    private String Pago;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime datacadastro;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime dataAtualizacao;

}
