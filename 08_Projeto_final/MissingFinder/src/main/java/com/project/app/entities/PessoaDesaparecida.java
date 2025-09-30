package com.project.app.entities;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoa_desaparecida")
public class PessoaDesaparecida implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPessoaDesaparecida;

    private String nome;
    private String data_nascimento;
    private String sexo;
    private String corPele;
    private double alturaCm;
    private double pesoKg;
    private String caracteristicas;
    private String informacoesAdicionais;
    private String dataDesaparecimento;
    private String localDesaparecimento;
    private String fotoUrl;
    //TODO - Atributos para adicionar 
    // deficiencia, tatuagem, cicatriz, parentes, orgao publico, estado civil...
    // arvore genealógica


    // ======== CONSTRUCTOR
    public PessoaDesaparecida() {
    }


    // ======== GETTERS AND SETTERS
    public UUID getIdPessoaDesaparecida() {
        return this.idPessoaDesaparecida;
    }

    public void setIdPessoaDesaparecida(UUID idPessoaDesaparecida) {
        this.idPessoaDesaparecida = idPessoaDesaparecida;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
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

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getInformacoesAdicionais() {
        return this.informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
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

    public String getFotoUrl() {
        return this.fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
    

    
    
}
