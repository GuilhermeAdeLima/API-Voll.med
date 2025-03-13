package voll.med.api.domain.consulta;

import jakarta.validation.constraints.NotNull;
import voll.med.api.domain.consulta.validacoes.MotivoCancelamento;

public record DadosCancelamentoConsulta(

        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {

}
