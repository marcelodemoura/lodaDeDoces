package br.com.loja.lojaDeDoces.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    @Column(nullable = false, length = 1)
    private boolean ative = true;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime datacadastro;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime dataAtualizacao;
}
