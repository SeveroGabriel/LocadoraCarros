package com.ufape.locadora;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {
    
    private Long id;
    private Cliente cliente;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Double valor;
    
    public Reserva(Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim, Double valor) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
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

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(id, reserva.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", carro=" + carro +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", valor=" + valor +
                '}';
    }
}
