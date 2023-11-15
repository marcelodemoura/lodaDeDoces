package br.com.loja.lojaDeDoces.dto;

import br.com.loja.lojaDeDoces.record.ClienteRecord;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
@Getter
@Setter
public class ClienteDTO {

    private final ClienteRecord clienteRecord;
    private Long id;
    private String nome;
    @CPF
    private String cpf;
    @Email
    private String email;
    private String telefone;


    public ClienteDTO(ClienteRecord clienteRecord, Long id,String nome, String cpf, String email, String telefone) {
        this.clienteRecord = clienteRecord;
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
}
