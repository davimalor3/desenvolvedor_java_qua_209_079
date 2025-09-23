package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        

        System.out.println("Informe seu nome: ");
        name = input.nextLine();
        System.out.println("Informe sua idade: ");
        age = input.nextInt();

        // IF e ELSE
        if(age < 18){
            System.out.println("\nO usuário "+name+", é menor de idade e não pode tirar habilitação!");
            System.out.println("Idade: "+age);
        }
        else{
            System.out.println("\nO usuário "+name+", é maior de idade e pode tira habilitação!");
            System.out.println("Idade: "+age);
        }




        input.close();
    }
}
