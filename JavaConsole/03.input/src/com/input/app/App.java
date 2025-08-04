package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name;
        String email;
        int age;

        System.out.println("Informe seu nome: ");
        name = input.nextLine();
        System.out.println("Informe sua idade: ");
        age = input.nextInt();
        
        // Limpeza do buffer
        input.nextLine();

        System.out.println("Informe seu email: ");
        email = input.nextLine();

        System.out.println("Nome: "+name);
        System.out.println("Idade: "+age);
        System.out.println("Email: "+email);

        input.close();


    }
}
