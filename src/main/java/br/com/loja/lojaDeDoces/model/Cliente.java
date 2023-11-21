package br.com.loja.lojaDeDoces.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tb_cliente")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50,unique = true)
    private String nome;
    @CPF
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;
    @Email
    @Column(nullable = false, unique = true, length = 30)
    private String email;
    @Column(nullable = false, unique = true, length = 11)
    private String telefone;
    @Column(nullable = false)
    private LocalDateTime registrationDate;


}
