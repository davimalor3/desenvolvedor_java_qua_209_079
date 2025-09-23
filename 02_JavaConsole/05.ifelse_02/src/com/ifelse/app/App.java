package com.ifelse.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        // Definição de variáveis
        String name;
        int age;
        double altura;

        System.out.println("Informe seu nome: ");
        name = input.nextLine();
        System.out.println("Informe sua idade: ");
        age = input.nextInt();
        System.out.println("Informe sua altura: ");
        altura = input.nextDouble();

        if(age >= 12 && altura >= 1.15 ){
            System.out.println("Is authorized");
        }else{
            System.out.println(name+" Unauthorized!");
        }

        input.close();
    }
}
