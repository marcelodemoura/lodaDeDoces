package br.com.loja.lojaDeDoces.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaDTO {

    private String nome;
    private String pagamento;
    private String produto;
    private String vendas;

    public EmpresaDTO(EmpresaDTO model) {
        this.nome = model.getNome();
        this.produto = model.getProduto();
        this.pagamento = model.getPagamento();
        this.vendas = model.getVendas();
    }


}
