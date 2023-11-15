package br.com.loja.lojaDeDoces.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
@Getter
@Setter
@Entity
@Table(name = "tb_cliente")
public class Cliente {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nome;
    @CPF
    @Column(nullable = false, length = 11)
    private String cpf;
    @Email
    @Column(nullable = false, length = 30)
    private String email;
    @Column(nullable = false, length = 11)
    private String telefone;


}
