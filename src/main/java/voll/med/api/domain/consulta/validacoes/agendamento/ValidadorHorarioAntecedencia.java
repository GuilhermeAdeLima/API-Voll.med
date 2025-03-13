package voll.med.api.domain.consulta.validacoes.agendamento;

import org.springframework.stereotype.Component;
import voll.med.api.domain.ValidacaoExeption;
import voll.med.api.domain.consulta.DadosAgendamentoConsulta;
import voll.med.api.domain.consulta.validacoes.agendamento.ValidadorAgendamentoDeConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

@Component("ValidadorHorarioAntecedenciaAgendamento")
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
