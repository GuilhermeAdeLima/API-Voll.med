package voll.med.api.domain;

public class ValidacaoExeption extends RuntimeException {
    public ValidacaoExeption(String mensagem) {
        super(mensagem);
    }
}
