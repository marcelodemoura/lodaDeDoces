package br.com.loja.lojaDeDoces.dto;

import lombok.Data;

@Data
public class ProdutoDTO {

    private Long id;
    private String descricao;
    private String vUnit;
    private int qtdeEstoque;
}
