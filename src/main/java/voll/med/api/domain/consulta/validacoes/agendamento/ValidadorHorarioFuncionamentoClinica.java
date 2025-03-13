package voll.med.api.domain.consulta.validacoes.agendamento;

import org.springframework.stereotype.Component;
import voll.med.api.domain.ValidacaoExeption;
import voll.med.api.domain.consulta.DadosAgendamentoConsulta;
import voll.med.api.domain.consulta.validacoes.agendamento.ValidadorAgendamentoDeConsulta;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoDaClinica = dataConsulta.getHour() > 18;
        if (domingo || antesDaAberturaDaClinica || depoisDoEncerramentoDaClinica) {
            throw new ValidacaoExeption("Consulta fora do horário de funcionamento da clínica");
        }

    }

}
