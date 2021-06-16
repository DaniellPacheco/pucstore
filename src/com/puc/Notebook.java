package com.puc;

public class Notebook extends Equipamento{
    private String tamanhoTela;
    private String processador;
    private String memoria;
    private String armazenamento;

    public Notebook(String marca, String modelo) {
        super(marca, modelo);
        this.tipo = "Notebook";
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanho_tela) {
        this.tamanhoTela = tamanho_tela;
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
}
