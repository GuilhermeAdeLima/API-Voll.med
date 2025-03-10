package voll.med.api.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import voll.med.api.domain.consulta.DadosAgendamentoConsulta;
import voll.med.api.domain.consulta.DadosDetalhamentoCunsulta;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        System.out.println(dados);
        return ResponseEntity.ok(new DadosDetalhamentoCunsulta(null, null, null, null));
    }

}
