package br.com.loja.lojaDeDoces.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
@Getter
@Setter
public class ClienteDTO {

    private Long id;
    private String nome;
    @CPF
    private String cpf;
    @Email
    private String email;
    private String telefone;


}
