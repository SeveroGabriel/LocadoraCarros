package com.ufape.locadora;

import java.time.LocalDate;
import java.util.List;

public class Relatorio {
    
    private int id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Aluguel> alugueis;
    private Double valorTotal;
    
    public Relatorio() {}
    
    public Relatorio(LocalDate dataInicio, LocalDate dataFim, List<Aluguel> alugueis, Double valorTotal) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.alugueis = alugueis;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    @Override
    public String toString() {
        return "Relatorio [id=" + id + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", alugueis=" + alugueis
                + ", valorTotal=" + valorTotal + "]";
    }
    
}
