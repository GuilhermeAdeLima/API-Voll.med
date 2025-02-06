package voll.med.api.endereco;

public record DadosEndereco
        (String logradouro,
         String bairro,
         String cep,
         String uf,
         String complemento,
         String cidade,
         String numero) {

}
