package br.com.loja.lojaDeDoces.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private String qtdeEstoque;

}
