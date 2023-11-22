package br.com.loja.lojaDeDoces.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TP_Doces", nullable = false, length = 50)
    private String tp_doces;
    @Column(name = "Qtde", nullable = false, length = 5)
    private int qtde;
    @Column(name = "Q_Total", nullable = false, length = 5)
    private BigDecimal v_Total;
    @Column(name = "Cliente", nullable = false, length = 100)
    private String cliente;
    @Column(name = "F_Pagamento", nullable = false, length = 30)
    private String f_Pagamento;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(name = "V_Pago", nullable = false, length = 5)
    private BigDecimal v_Pago;
    @Column(name = "Pago", nullable = false, length = 5)
    private boolean Pago = true;

}
