package com.fundamentals.model;

// "final" used to end a class
final public class PessoaFisica extends Person {
    private String name;
    private String datanasc;
    private String cpf;

    public PessoaFisica(String name, String datanasc, String cpf, String email, String tel, String address) {
        super(email, tel, address);
        this.name = name;
        this.datanasc = datanasc;
        this.cpf = cpf;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatanasc() {
        return this.datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
