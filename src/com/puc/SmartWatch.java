package com.puc;

public class SmartWatch extends Equipamento{
    private String tamanhoTela;
    private String tipoPulseira;
    private String cor;

    public SmartWatch(String marca, String modelo) {
        super(marca, modelo);
        this.tipo = "SmartWatch";
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getTipoPulseira() {
        return tipoPulseira;
    }

    public void setTipoPulseira(String tipoPulseira) {
        this.tipoPulseira = tipoPulseira;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
