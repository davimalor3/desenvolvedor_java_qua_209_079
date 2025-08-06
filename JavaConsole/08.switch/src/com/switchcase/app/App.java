package com.switchcase.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int option;
        double x, y, result;
        

        System.out.println("Escolha um numero:");
        x = sc.nextDouble();
        System.out.println("Escolha outro numero:");
        y = sc.nextDouble();

        // Garbage Collector
        sc.nextLine();
        
        do {
        // menu
        System.out.println("ESCOLHA UMA OPÇÃO\n\n");
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SAIR DO PROGRAMA\n");
        option = sc.nextInt();

        // funcao switch
        switch (option) {
            case 1:
                result = x+y;
                System.out.println("O resultado é: "+result);
                break;
            case 2: 
                result = x-y;
                System.out.println("O resultado é: "+result);
                break;

            case 3: 
                result = x*y;
                System.out.println("O resultado é: "+result);
                break;

            case 4: 
                result = x/y;
                System.out.println("O resultado é: "+result);
                break;

            case 5: 
                System.out.println("SAINDO DO PROGRAMA...");
                break;
        
            default:
                System.out.println("Opção invalida!");
                break;
        }

    } while (option != 5);
        System.out.println("PROGRAMA FINALIZADO!");
        
        sc.close();
    }
}
