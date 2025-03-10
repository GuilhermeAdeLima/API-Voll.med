package voll.med.api.domain.consulta;

import java.time.LocalDateTime;

public record DadosDetalhamentoCunsulta(Long id, Long idMedico, Long idPaciente, LocalDateTime data) {
}
