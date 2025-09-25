package com.project.app.models;

import java.io.Serializable;

// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

public class PessoaDesaparecida implements Serializable {
    private static final long serialVersionUID = 1L;

    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private int idade;
    private String sexo;
    private String corPele;
    private double alturaCm;
    private double pesoKg;
    private String dataDesaparecimento;
    private String localDesaparecimento;
    private String caracteristicas;
    private String fotoUrl;

    // Construtor
    public PessoaDesaparecida() {
    }

    // Getter and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorPele() {
        return this.corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public double getAlturaCm() {
        return this.alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getDataDesaparecimento() {
        return this.dataDesaparecimento;
    }

    public void setDataDesaparecimento(String dataDesaparecimento) {
        this.dataDesaparecimento = dataDesaparecimento;
    }

    public String getLocalDesaparecimento() {
        return this.localDesaparecimento;
    }

    public void setLocalDesaparecimento(String localDesaparecimento) {
        this.localDesaparecimento = localDesaparecimento;
    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getFotoUrl() {
        return this.fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

}
