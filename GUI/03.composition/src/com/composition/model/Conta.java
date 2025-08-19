package com.composition.model;
import com.composition.interfaces.IConta;

public class Conta implements IConta {
    private String agency;
    private String nConta;
    private double saldo;
    private Pessoa titular;

    public Conta(String agency, String nConta, double saldo, Pessoa titular) {
        this.agency = agency;
        this.nConta = nConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getAgency() {
        return this.agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }


    @Override
    public String showInfo() {
        return "Agencia: "+this.agency + 
        "\nNumero da conta: "+this.nConta +
        "\nSaldo da conta R$: "+String.format("%.2f", this.saldo) +
        "\nNome do titular da conta: " + this.titular.getNome() +
        "\nCPF do titular da conta: " + this.titular.getCpf() +
        "\nEmail: " + this.titular.getEmail() +
        "\nEndereço: " + this.titular.getEndereco() +
        "\nTelefone: " + this.titular.getTel();   
    }

    @Override
    public double fazerDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;

    }

    @Override
    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;

    }
    
}
