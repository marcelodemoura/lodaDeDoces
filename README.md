#Loja de doces Api criada para estudos.
##Diagrama de classe

```mermaid

{
  "cliente": {
    "id": "Long",
    "nome": "String",
    "cpf": "private String",
    "email": "String",
    "telefone": "String"
  },
  "empresa": {
    "id": "Long",
    "nome": "String",
    "ativo": "boolean"
  },
  "pagamento": {
    "id": "Long",
    "descricao": "String"
  },
  "produto": {
    "id": "Long",
    "descricao": "String",
    "qtdeEstoque": "int"
  },
  "vendas": {
    "id": "Long",
    "tipoDoces": "String",
    "quantidade": "String",
    "valorTotal": "String",
    "cliente": "String",
    "formaPagamento": "String",
    "dataCompra": "String",
    "dataPagamento": "String",
    "valorPago": "String",
    "statusPagamento": "String"
  }
}
```
