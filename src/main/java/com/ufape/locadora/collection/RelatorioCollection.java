package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Aluguel;
import com.ufape.locadora.Relatorio;
import com.ufape.locadora.DTO.AluguelDTO;
import com.ufape.locadora.DTO.CarroDTO;
import com.ufape.locadora.DTO.ClienteDTO;

public interface RelatorioCollection {
    List<Relatorio> findAll();
    Optional<Relatorio> findById(Long id);
    Relatorio save(Relatorio relatorio);
    void deleteById(Long id);
	<AluguelDTO> List<AluguelDTO> gerarRelatorioAlugueis();
	Double gerarRelatorioFaturamento();
	List<CarroDTO> gerarRelatorioCarrosMaisAlugados();
	List<ClienteDTO> gerarRelatorioClientesMaisFrequentes();
	Aluguel getById(Long id);
}
