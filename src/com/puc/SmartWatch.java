package com.puc;

public class SmartWatch extends Equipamento {

    public SmartWatch (String marca, String modelo, String memoria, String armazenamento, String tamanhoTela, String processador) {
        super(marca, modelo, processador, memoria, armazenamento, tamanhoTela);
        this.tipo = "SmartWatch";
    }

    @Override
    public String mostrarPreco() {
        return "SmartWatch importado, no Brasil ta caro!";
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
            "Observação: " + this.mostrarPreco() + "\n";
    }
}
