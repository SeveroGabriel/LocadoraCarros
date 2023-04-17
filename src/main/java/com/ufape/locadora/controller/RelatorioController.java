package com.ufape.locadora.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.locadora.collection.RelatorioCollection;
import com.ufape.locadora.DTO.AluguelDTO;
import com.ufape.locadora.DTO.CarroDTO;
import com.ufape.locadora.DTO.ClienteDTO;


@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    private final RelatorioCollection relatorioCollection;

    public RelatorioController(RelatorioCollection relatorioCollection) {
        this.relatorioCollection = relatorioCollection;
    }

    @GetMapping("/alugueis")
    public ResponseEntity<List<AluguelDTO>> relatorioAlugueis() {
        List<AluguelDTO> alugueis = relatorioCollection.gerarRelatorioAlugueis();
        return ResponseEntity.ok(alugueis);
    }

    @GetMapping("/faturamento")
    public ResponseEntity<Double> relatorioFaturamento() {
        Double faturamento = relatorioCollection.gerarRelatorioFaturamento();
        return ResponseEntity.ok(faturamento);
    }

    @GetMapping("/carros-mais-alugados")
    public ResponseEntity<List<CarroDTO>> relatorioCarrosMaisAlugados() {
        List<CarroDTO> carrosMaisAlugados = relatorioCollection.gerarRelatorioCarrosMaisAlugados();
        return ResponseEntity.ok(carrosMaisAlugados);
    }

    @GetMapping("/clientes-mais-frequentes")
    public ResponseEntity<List<ClienteDTO>> relatorioClientesMaisFrequentes() {
        List<ClienteDTO> clientesMaisFrequentes = relatorioCollection.gerarRelatorioClientesMaisFrequentes();
        return ResponseEntity.ok(clientesMaisFrequentes);
    }
}
