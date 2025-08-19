package com.exercise5.model;

public class Abastecimento {
    private double etanol;
    private double gasoline;


    public Abastecimento(double etanol, double gasoline) {
        this.etanol = etanol;
        this.gasoline = gasoline;

    }

    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    public double getGasoline() {
        return this.gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public String verificacao(){

       return (this.etanol <= (this.gasoline * 0.7)) 
       ? "Compensa mais abastecer com Etanol" : "Compensa mais abastecer com Gasolina";
    }
}


// Crie um app para verificar qual melhor combustivel para um carro flex abastecer
// NOTE: compensa mais abastecer com etanol caso o valor dele seja até 70% do valor da gasolina