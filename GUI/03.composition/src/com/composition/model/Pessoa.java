package com.composition.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String tel;
    private String endereco;

    public Pessoa(String nome, String cpf, String email, String tel, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tel = tel;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
