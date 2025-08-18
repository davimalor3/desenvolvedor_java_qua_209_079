package com.exercise4.model;

public class ImcCalculator {
    private double peso;
    private double height;

    public ImcCalculator(double peso, double height) {
        this.peso = peso;
        this.height = height;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double calculoIMC(){
        return this.peso/ (this.height * this.height);
    }

    public String diagnostic(double imc){

        return (imc <= 18.5) ? "Abaixo do peso!"
        : (imc < 25) ? "Peso normal!"
        : (imc < 30) ? "Acima do Peso!"
        : (imc < 35) ? "Obesidade nivel 1"
        : (imc < 40) ? "Obesidade nivel 2" 
        : "Obesidade morbida";
    }
    

}
