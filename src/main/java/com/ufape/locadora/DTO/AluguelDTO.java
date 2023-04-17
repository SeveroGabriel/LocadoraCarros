package com.ufape.locadora.DTO;

import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;

import java.time.LocalDate;

public class AluguelDTO {
    private static final Cliente Cliente = null;
	private Long id;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Double valor;
    private Boolean pago;

    public AluguelDTO() {}

    public AluguelDTO(Long id, Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim, Double valor, Boolean pago) {
        this.id = id;
        this.Cliente = Cliente();
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
        this.Cliente = Cliente;
    }

    public Carro carro() {
        return carro;
    }

    public void setIdCarro(Long idCarro) {
        this.idCarro = idCarro;
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
