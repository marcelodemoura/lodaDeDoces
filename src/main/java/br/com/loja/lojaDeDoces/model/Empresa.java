package br.com.loja.lojaDeDoces.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String nome;
    @Column(nullable = false, scale = 13, precision = 2)
    private BigDecimal pagamento;
    @Column(nullable = false, length = 25)
    private String produto;
    private String vendas;
}
