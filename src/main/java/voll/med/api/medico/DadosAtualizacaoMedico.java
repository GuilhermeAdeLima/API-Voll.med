package voll.med.api.medico;

import jakarta.validation.constraints.NotNull;
import voll.med.api.endereco.DadosEndereco;
import voll.med.api.endereco.Endereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
