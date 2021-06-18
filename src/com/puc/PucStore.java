package com.puc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PucStore{

    private ArrayList<Equipamento> carrinho;

    public PucStore() {
        this.carrinho = new ArrayList<Equipamento>();
    }

    public void adicionarEquipamento(Equipamento item) {
        this.carrinho.add(item);
    }

    public void listarItens() {
        for (Equipamento item:carrinho) {
            System.out.println(item.listarEquipamento());
        }
        System.out.println("Total = " + this.carrinho.size() + " equipamentos listados com sucesso!\n");
    }

    public void removerItem(Equipamento item) {
        if(this.carrinho.contains(item)) {
            this.carrinho.remove(item);
            System.out.println("Equipamento " + item.toString() + " excluido com sucesso.\n");
        } else {
            System.out.println("Equipamento não encontrado!\n");
        }
    }

    public void removerItens() {
        this.carrinho.clear();
        System.out.println("Itens removidos do carrinho com sucesso!\n");
    }

    public static void main(String[] args) {
        PucStore loja = new PucStore();


        Smartphone iphone = new Smartphone("Apple", "11 Pro", "16Gb", "32Gb", "","");
        Smartphone iphone1 = new Smartphone("Apple", "11 Pro", "16Gb", "32Gb", "","");
        Smartphone iphone2 = new Smartphone("Apple", "11 Pro", "16Gb", "32Gb", "","");
        Notebook alienware = new Notebook("Alienware", "Personal", "8Gb", "500Gb", "15.6", "i5-10300H");

        loja.adicionarEquipamento(iphone);
        loja.adicionarEquipamento(iphone1);
        loja.adicionarEquipamento(iphone2);
        loja.adicionarEquipamento(alienware);
        loja.listarItens();
        loja.removerItem(iphone2);
        loja.listarItens();
        loja.removerItens();

        }
}
