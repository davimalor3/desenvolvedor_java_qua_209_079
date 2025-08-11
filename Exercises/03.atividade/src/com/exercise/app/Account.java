package com.exercise.app;


public class Account {
    String name, cpfString;
    int agency, numberAccount;
    double saldo;
}

public String sayHello(){
    return "Olá, nome "+this.name+"";
}


    public Account(String name, String cpfString, int agency, int numberAccount, double saldo) {
        this.name = name;
        this.cpfString = cpfString;
        this.agency = agency;
        this.numberAccount = numberAccount;
        this.saldo = saldo;
    }

    public void showInfo(){
        System.out.println("Bem vindo a conta: \n");
        System.out.println("Nome: "+this.name);
        System.out.println("CPF: "+this.cpfString);
        System.out.println("Agencia: "+this.agency);
        System.out.println("Numero da conta: "+this.numberAccount);
        System.out.println("Saldo: "+this.saldo);
    }

    public void realizarSaque(){
        int retirada = 0;

    }

    public void depositar(){}



