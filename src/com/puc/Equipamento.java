package com.puc;

public class Equipamento {
    private String marca;
    private String modelo;
    private String processador;
    private String memoria;
    private String armazenamento;
    private String tamanhoTela;
    protected String tipo;

    public Equipamento(String marca, String modelo, String processador, String memoria, String armazenamento, String tamanhoTela) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.tamanhoTela = tamanhoTela;
    }

    public String mostrarPreco() {
        return "Equipamento importado, no Brasil ta caro!";
    }

    public String listarEquipamento() {
        return "----- Equipamentos -----";
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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
