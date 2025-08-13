package com.exercise.app;


public class Account {
    // atributos
    public String name;
    public String cpfString;
    public String agency;
    public String nAccount;
    public String userAccount;
    public String password;
    public double saldo;


public String sayHello(){
    return "Olá, nome "+this.name+"";
}


    public Account(String name, String cpfString, String agency, String nAccount, double saldo) {
        this.name = name;
        this.cpfString = cpfString;
        this.agency = agency;
        this.nAccount = nAccount;
        this.saldo = saldo;
    }

    public void showInfo(){
        System.out.println("Bem vindo a conta: \n");
        System.out.println("Nome: "+this.name);
        System.out.println("CPF: "+this.cpfString);
        System.out.println("Agencia: "+this.agency);
        System.out.println("Numero da conta: "+this.nAccount);
        System.out.println("Saldo: R$"+this.saldo);
    }

    
        public void depositar(double valor){

            if (valor <= 0){
                System.out.println("Deposito invalido");
            }else{
                saldo = saldo + valor;
                System.out.println("Saldo atual: R$"+saldo);
            }
        }
    


        // public void realizarSaque(double valor){
        //     if (valor > saldo){
        //         System.out.println("Saldo Insuficiente!");
        //     }else{
        //         saldo = saldo - valor;
        //     }

        // }

    // public double depositar(double valor){
    //     this.saldo += valor;
    //     return this.saldo;
    // }

    public double saque(double valor){
        this.saldo -=valor;
        return this.saldo;
    }
}



