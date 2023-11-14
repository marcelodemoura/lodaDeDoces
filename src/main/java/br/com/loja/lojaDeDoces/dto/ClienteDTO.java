package br.com.loja.lojaDeDoces.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
@Getter
@Setter
public class ClienteDTO {

    private String nome;
    @CPF
    private String cpf;
    @Email
    private String email;
    private String telefone;

    public ClienteDTO(ClienteDTO model){
        this.nome = model.getNome();
        this.cpf = model.getCpf();
        this.email = model.getEmail();
        this.telefone = model.getTelefone();
    }
}
