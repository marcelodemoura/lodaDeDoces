package br.com.loja.lojaDeDoces.dto;


import br.com.loja.lojaDeDoces.record.EmpresaRecord;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class EmpresaDTO {

    private final EmpresaRecord empresaRecord;
    private Long id;
    private String nome;
    private BigDecimal pagamento;
    private String produto;
    private String vendas;

    public EmpresaDTO(EmpresaRecord empresaRecord,Long id, String nome, BigDecimal pagamento, String produto, String vendas) {
        this.empresaRecord = empresaRecord;
        this.id = id;
        this.nome = nome;
        this.pagamento = pagamento;
        this.produto = produto;
        this.vendas = vendas;
    }
}
