package com.project.app.entities;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PessoaDesaparecida implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private int idade;
    private String sexo;
    private String corPele;
    private double alturaCm;
    private double pesoKg;
    private String caracteristicas;
    private String deficiencias;
    private String informacoesAdicionais;
     
    // tatuagem, cicatriz, parentes, orgao publico, estado civil

    private String dataDesaparecimento;
    private String localDesaparecimento;
    private String fotoUrl;


}
