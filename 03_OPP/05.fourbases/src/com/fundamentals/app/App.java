package com.fundamentals.app;

import com.fundamentals.model.PessoaFisica;
import com.fundamentals.model.PessoaJuridica;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica p1 = new PessoaFisica("", "", "", "", "", "");
        PessoaJuridica pj1 = new PessoaJuridica("", "", "", "", "", "");


        //Input Pessoa Fisica
        System.out.println("\n\n------------Informe os dados do usuário -------------\n");
        System.out.println("Informe o nome:");
        p1.setName(sc.nextLine());
        System.out.println("Informe o CPF:");
        p1.setCpf(sc.nextLine());
        System.out.println("Informe a data de nascimento:");
        p1.setDatanasc(sc.nextLine());
        System.out.println("Informe o endereço:");
        p1.setAddress(sc.nextLine());
        System.out.println("Informe o telefone");
        p1.setTel(sc.nextLine());

        //Input Dados da Empresa
        System.out.println("\n\n------------Informe os dados da empresa ------------\n");
        System.out.println("Informe a razão social:");
        pj1.setRazaoSocial(sc.nextLine());
        System.out.println("Informe o nome da empresa:");
        pj1.setNomeFantasia(sc.nextLine());
        System.out.println("Informe cnpj:");
        pj1.setCnpj(sc.nextLine());
        System.out.println("Informe email:");
        pj1.setEmail(sc.nextLine());
        System.out.println("Informe o endereço:");
        pj1.setAddress(sc.nextLine());
        System.out.println("Informe o telefone");
        pj1.setTel(sc.nextLine());



        //OUTPUT
        System.out.println("Informações do usuario");
        System.out.println("Nome: "+p1.getName());
        System.out.println("CPF: "+p1.getCpf());
        System.out.println("Data de Nascimento: "+p1.getDatanasc());
        System.out.println("Endereço: "+p1.getAddress());
        System.out.println("Telefone: "+p1.getTel());


        System.out.println("\n\nInformações da Empresa");
        System.out.println("Nome Fantasia: "+pj1.getNomeFantasia());
        System.out.println("Razão Social: "+pj1.getRazaoSocial());
        System.out.println("CNPJ"+pj1.getCnpj());
        System.out.println("Endereço: "+pj1.getAddress());
        System.out.println("Telefone: "+pj1.getTel());
        System.out.println("Email: "+pj1.getEmail());

        sc.close();
    }
}
