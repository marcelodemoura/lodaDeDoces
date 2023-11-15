package br.com.loja.lojaDeDoces.dto;


import br.com.loja.lojaDeDoces.record.EmpresaRecord;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaDTO {

    private final EmpresaRecord empresaRecord;
    private Long id;
    private String nome;
    private String pagamento;
    private String produto;
    private String vendas;

    public EmpresaDTO(EmpresaRecord empresaRecord,Long id, String nome, String pagamento, String produto, String vendas) {
        this.empresaRecord = empresaRecord;
        this.id = id;
        this.nome = nome;
        this.pagamento = pagamento;
        this.produto = produto;
        this.vendas = vendas;
    }
}
