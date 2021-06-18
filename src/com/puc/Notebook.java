package com.puc;

public class Notebook extends Equipamento{
    private String tamanhoTela;
    private String processador;
    private String memoria;
    private String armazenamento;

    public Notebook (String marca, String modelo, String memoria, String armazenamento, String tamanhoTela, String processador) {
        super(marca, modelo, processador, memoria, armazenamento, tamanhoTela);
        this.tipo = "Notebook";
    }

    @Override
    public String mostrarPreco() {
        return "Notebook importado, no Brasil ta caro!";
    }

    @Override
    public String listarEquipamento() {
        return
            "Tipo: " + this.getTipo() + "\n" +
            "Marca: " + this.getMarca() + "\n" +
            "Modelo: " + this.getModelo() + "\n" +
            "Processador: " + this.getProcessador() + "\n" +
            "Memoria: " + this.getMemoria() + "\n" +
            "Armazenamento: " + this.getArmazenamento() + "\n" +
            "Armazenamento: " + this.getTamanhoTela() + "\n" +
            "Tamanho de Tela: " + getTamanhoTela() + "\n" +
            "Observação: " + this.mostrarPreco() + "\n";
    }
}
