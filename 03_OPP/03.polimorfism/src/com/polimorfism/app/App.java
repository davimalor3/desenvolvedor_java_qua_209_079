package com.polimorfism.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica p1 = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica pj1 = new PessoaJuridica(null, null, null, null, null, null);




        // DADOS DO USUARIO
        System.out.println("DADOS DO USUÁRIO:\n");

        System.out.println("Informe o nome do usuario:");
        p1.name = sc.nextLine();

        System.out.println("Informe a data de nascimento:");
        p1.dataNascimento = sc.nextLine();

        System.out.println("Informe o cpf:");
        p1.cpf = sc.nextLine();

        System.out.println("Informe o email:");
        p1.email = sc.nextLine();

        System.out.println("Informe o telefone:");
        p1.tel = sc.nextLine();

        System.out.println("Informe o endereço:");
        p1.address = sc.nextLine();




        // DADOS DA EMPRESA
        System.out.println("\nDADOS DA EMPRESA");

        System.out.println("Informe o nome da Empresa:");
        pj1.nomeFantasia = sc.nextLine();
        
        System.out.println("Informe a razão social:");
        pj1.razaoSocial = sc.nextLine();
        
        System.out.println("Informe o cnpj:");
        pj1.cnpj = sc.nextLine();
        
        System.out.println("Informe o email:");
        pj1.email = sc.nextLine();
        
        System.out.println("Informe o endereço:");
        pj1.address = sc.nextLine();


        
        System.out.println("DADOS DO USUÁRIO\n"+p1.hello()+"\n\n");
        System.out.println("DADOS DA EMPRESA\n\n"+pj1.hello()+"\n\n");


        sc.close();
    }
}
