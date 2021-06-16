package com.puc;

public class Equipamento {
    private String marca;
    private String modelo;
    protected String tipo;

    public Equipamento(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimir() {
        System.out.println("Cadastro do equipamento " + this.marca);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}
