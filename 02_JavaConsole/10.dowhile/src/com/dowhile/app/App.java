package com.dowhile.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int option, age;
        double height;


        do{
            System.out.println("Informe uma opção:\n\n");
            System.out.println("1 - CADASTRAR NOVO USUARIO USUARIO");
            System.out.println("2 - SAIR DO PROGRAMA");
            option = sc.nextInt();

            if (option == 1){
                sc.nextLine();
                System.out.println("Informe seu nome:");
                name = sc.nextLine();
                System.out.println("Informe sua idade:");
                age = sc.nextInt();
                System.out.println("Informe sua altura:");
                height = sc.nextDouble();

                if (age >= 12 && height >= 1.15) System.out.println("\n\n-------------------------\n"+name+" está autorizado\n-------------------------\n\n");
                else System.out.println("\n\n-------------------------\n"+name+" não está autorizado\n-------------------------\n\n");
            } 
            else if (option !=2){
                System.out.println("\n\n-------------------------\nOpção Invalida!\n-------------------------\n\n");
            }
            
        }while (option != 2);

        
        sc.close();

        
    }
}
