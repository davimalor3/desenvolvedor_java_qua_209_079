package com.rules.model;

import com.rules.interfaces.IConta;

public class Conta implements IConta {
    private String titular;
    private String cpf;
    private String agency;
    private String nConta;
    private double saldo;


    public Conta(String titular, String cpf, String agency, String nConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agency = agency;
        this.nConta = nConta;
        this.saldo = saldo;
    }


    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgency() {
        return this.agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getnConta() {
        return this.nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public void showInfo() {
        System.out.println("Nome do titular: "+this.titular);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Número da conta: "+this.nConta);
        System.out.println("Agencia: "+this.agency);
        System.out.println("Saldo da conta: R$ "+ String.format("%.2f", this.saldo));
    }

    @Override
    public double depositar(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

}
