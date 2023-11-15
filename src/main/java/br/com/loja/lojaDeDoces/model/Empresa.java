package br.com.loja.lojaDeDoces.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
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
    @Column(nullable = false)
    private String vendas;
}
