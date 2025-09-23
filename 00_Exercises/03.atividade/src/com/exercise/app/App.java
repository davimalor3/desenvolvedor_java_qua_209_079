package com.exercise.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account user1 = new Account("", "", "1001-5", "777888", 0.0);
        int option;

        System.out.println("Informe o nome do titular da conta:");
        user1.name = sc.nextLine();
        
        System.out.println("Informe o CPF do titular:");
        user1.cpfString = sc.nextLine();
        do{
            // MENU DE OPÇÕES 
            System.out.println("\n------------MENU PRINCIPAL-------------");
            System.out.println("1 - EXIBIR INFORMAÇÕES");
            System.out.println("2 - DEPOSITO");
            System.out.println("3 - SAQUE");
            System.out.println("4 - SAIR DO PROGRAMA!");
            option = sc.nextInt();
            double valor = 0.0;

            switch(option){
                case 1:
                    user1.showInfo();
                    break;
                case 2:
                    valor = sc.nextInt();
                    System.out.println((valor > 0) ? "Deposito efetuado com sucesso! R$ "+ user1.saque(valor) :
                    "Valor depositado invalido!");
                    break;

                case 3:
                    System.out.println("Deseja sacar quanto?");
                    valor = sc.nextDouble();
                    user1.saque(valor);
                case 4:
                    System.out.println("Saindo do programa");
                default:
                    System.out.println("Opção Invalida!");
            }

        } while (option != 4);

        sc.close();
    }
}
