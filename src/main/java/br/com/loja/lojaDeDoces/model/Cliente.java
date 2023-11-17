package br.com.loja.lojaDeDoces.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.LocalDateTime;

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
    @Column(nullable = false, length = 14)
    private String cpf;
    @Email
    @Column(nullable = false, length = 30)
    private String email;
    @Column(nullable = false, length = 11)
    private String telefone;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime datacadastro;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy@HH:mm:ss")
    LocalDateTime dataAtualizacao;


}
