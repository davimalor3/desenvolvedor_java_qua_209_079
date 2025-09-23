package com.heranca.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica p1 = new PessoaFisica();
        PessoaJuridica pj1 = new PessoaJuridica();

        System.out.println("Informe o nome ");
        p1.name = sc.nextLine();
        System.out.println("Informe o cpf: ");
        p1.cpf = sc.nextLine();
        System.out.println("Informe o email: ");
        p1.email = sc.nextLine();
        System.out.println("Informe o telefone: ");
        p1.tel = sc.nextLine();
        System.out.println("Informe o endereço: ");
        p1.adress = sc.nextLine();
        

        System.out.println("Informe a razão social ");
        pj1.razaoSocial = sc.nextLine();
        System.out.println("Informe o nome fantasia: ");
        pj1.nomeFantasia = sc.nextLine();
        System.out.println("Informe o cnpj: ");
        pj1.cnpj = sc.nextLine();
        System.out.println("Informe o telefone da empresa: ");
        pj1.tel = sc.nextLine();
        System.out.println("Informe o email da empresa: ");
        pj1.email = sc.nextLine();
        

        // output
        System.out.println("\n\n--- INFORMAÇÕES DE USUÁRIO ---");
        System.out.println("Nome: "+p1.name);
        System.out.println("CPF: "+p1.cpf);
        System.out.println("Email: "+p1.email);
        System.out.println("Telefone: "+p1.tel);
        System.out.println("Endereço: "+p1.adress);
        System.out.println("\n\n");

        System.out.println("--- INFORMAÇÕES DA EMPRESA ---\n");
        System.out.println("Razão Social: "+pj1.razaoSocial);
        System.out.println("Nome Fantasia: "+pj1.nomeFantasia);
        System.out.println("CNPJ: "+pj1.nomeFantasia);
        System.out.println("Telefone: "+pj1.tel);
        System.out.println("Email: "+pj1.email);


        sc.close();
    }
}
