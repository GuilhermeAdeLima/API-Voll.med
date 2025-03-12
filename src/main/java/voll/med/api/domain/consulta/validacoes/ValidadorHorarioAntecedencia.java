package voll.med.api.domain.consulta.validacoes;

import org.springframework.stereotype.Component;
import voll.med.api.domain.ValidacaoExeption;
import voll.med.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferancaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if(diferancaEmMinutos < 30) {
            throw new ValidacaoExeption("Consulta deve ser agendada com antecedência míni,a de 30 minutos");
        }

    }

}
