package com.puc;

public class Smartphone extends Equipamento{

    public Smartphone(String marca, String modelo, String memoria, String armazenamento, String tamanhoTela, String processador) {
        super(marca, modelo, processador, memoria, armazenamento, tamanhoTela);
        this.tipo = "Smartphone";
    }

    @Override
    public String mostrarPreco() {
        return "Smartphone importado, no Brasil ta caro!";
    }

    @Override
    public String listarEquipamento() {
        return
            "Tipo: " + this.getTipo() + "\n" +
            "Marca: " + this.getMarca() + "\n" +
            "Modelo: " + this.getModelo() + "\n" +
            "Memoria: " + this.getMemoria() + "\n" +
            "Armazenamento: " + this.getArmazenamento() + "\n" +
            "Observação: " + this.mostrarPreco() + "\n";
    }
}
