package com.ufape.locadora.DTO;

public class CarroDTO {
    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int kmRodado;
    private Double valorDiaria;
    private Boolean disponivel;

    public CarroDTO() {
    }

    public CarroDTO(Long id, String marca, String modelo, String cor, int ano, int kmRodado, Double valorDiaria, Boolean disponivel) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.kmRodado = kmRodado;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(int kmRodado) {
        this.kmRodado = kmRodado;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
