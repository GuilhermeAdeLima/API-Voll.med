package voll.med.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import voll.med.api.domain.ValidacaoExeption;
import voll.med.api.domain.consulta.DadosAgendamentoConsulta;
import voll.med.api.domain.paciente.PacienteRepository;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {

        if (dados.idPaciente() == null) {
            return;
        }

        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
        if (!pacienteEstaAtivo) {
            throw new ValidacaoExeption("Consulta não pode ser agendada com paciente inativo!");
        }

    }
}
