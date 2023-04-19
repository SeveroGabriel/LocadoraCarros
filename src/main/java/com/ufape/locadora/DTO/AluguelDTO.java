package com.ufape.locadora.DTO;

import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;

import java.time.LocalDate;

public class AluguelDTO {
    private static Cliente Cliente = null;
	private Long id;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Double valor;
    private Boolean pago;

    public AluguelDTO() {}

    public AluguelDTO(Long id, Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim, Double valor, Boolean pago) {
        this.id = id;
        AluguelDTO.Cliente = getCliente();
        this.carro = carro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.pago = pago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        AluguelDTO.Cliente = Cliente;
    }

    public Carro carro() {
        return carro;
    }

    public void setIdCarro(Long idCarro) {
        this.carro = carro;
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

    public void setDataFim(LocalDate string) {
        this.dataFim = string;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }
}
