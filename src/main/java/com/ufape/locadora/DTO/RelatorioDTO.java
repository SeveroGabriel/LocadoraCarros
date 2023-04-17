package com.ufape.locadora.DTO;

import java.time.LocalDate;
import java.util.List;
import com.ufape.locadora.Aluguel;

public class RelatorioDTO {

	private Long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Aluguel> alugueis;
    private Double valorTotal;
    
	public RelatorioDTO(Long id, LocalDate dataInicio, LocalDate dataFim, List<Aluguel> alugueis, Double valorTotal) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.alugueis = alugueis;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public List<Aluguel> getAlugueis() {
		return alugueis;
	}

	public void setAlugueis(List<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
    
}
