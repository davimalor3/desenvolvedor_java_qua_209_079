package com.exercise.model;
import com.exercise.interfaces.ICarro;

public class Carro implements ICarro{
    private String fabricante;
    private String marca;
    private String placa;
    private String ano;
    private String cor;
    private Pessoa nomePessoa;


    public Carro(String fabricante, String marca, String placa, String ano, String cor, Pessoa nomePessoa) {
        this.fabricante = fabricante;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.nomePessoa = nomePessoa;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getNomePessoa() {
        return this.nomePessoa;
    }

    public void setNomePessoa(Pessoa nomePessoa) {
        this.nomePessoa = nomePessoa;
    }



    @Override
    public String showInfo() {
        return "==== INFORMAÇÕES DO PROPRIETÁRIO DO VEÍCULO ====\n\nNome do proprietário: " + this.nomePessoa +
        "\nFabricante: " + this.fabricante +
        "\nMarca: " +this.marca+
        "\nPlaca: " +this.placa+
        "\nAno: " +this.ano+
        "\nCor: " +this.cor;
    }

}
