package br.com.loja.lojaDeDoces.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 20,unique = true)
    private String descricao;
    @Column(nullable = false,length = 50)
    private String vUnit;
    @Column(nullable = false,length = 50)
    private int qtdeEstoque;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime datacadastro;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime dataAtualizacao;

}
