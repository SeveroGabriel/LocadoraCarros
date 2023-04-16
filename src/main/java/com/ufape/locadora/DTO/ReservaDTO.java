package com.ufape.locadora.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class ReservaDTO {
    private Long id;
    private CarroDTO carro;
    private ClienteDTO cliente;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private BigDecimal valorTotal;
    
    public ReservaDTO() {}
    
    public ReservaDTO(Long id, CarroDTO carro, ClienteDTO cliente, LocalDateTime dataInicio,
                      LocalDateTime dataFim, BigDecimal valorTotal) {
        this.id = id;
        this.carro = carro;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorTotal = valorTotal;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CarroDTO getCarro() {
		return carro;
	}

	public void setCarro(CarroDTO carro) {
		this.carro = carro;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
    
}
