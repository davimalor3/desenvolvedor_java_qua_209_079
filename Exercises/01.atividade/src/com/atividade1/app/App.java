package com.atividade1.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String name;
        int option;
        double peso, height, imc;

        do{
            System.out.println("Informe uma opção:\n\n");
            System.out.println("1 - CALCULAR IMC");
            System.out.println("2 - SAIR DO PROGRAMA");
            option = sc.nextInt();

            if (option == 1){
                sc.nextLine();
                System.out.println("Informe seu nome:");
                name = sc.nextLine();
                System.out.println("Informe seu peso:");
                peso = sc.nextDouble();
                System.out.println("Informe sua altura:");
                height = sc.nextDouble();

                imc = peso/(height * height);
                

                if (imc < 18.5) System.out.println("\nAbaixo do peso!\n"+name+", procure um nutricionista!");
                else if(imc >= 18.5 || imc <= 24.9) System.out.println("\nPeso normal!");
                else if(imc >= 25 || imc <= 29.9) System.out.println("\nSobrepeso!\n"+name+", procure um nutricionista!");
                else if(imc >= 30 || imc <= 34.9) System.out.println("\nObesidade grau 1\n"+name+", procure um nutricionista!");
                else if(imc >= 35 || imc <= 39.9) System.out.println("\nObesidade grau 2\n"+name+", procure um nutricionista!");
                else System.out.println("Obesidade grau 3!");
            } 
            else if (option !=2){
                System.out.println("\n\n-------------------------\nOpção Invalida!\n-------------------------\n\n");
            }
            
        }while (option != 2);

        
        sc.close();

    }
}
