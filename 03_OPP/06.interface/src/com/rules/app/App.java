package com.rules.app;

import com.rules.model.Conta;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta("", "", "1234-5", "123456-9", 0);
        Scanner sc = new Scanner(System.in);
        int option;
        double valor = 0.0;


            System.out.println("Informe o nome do titular");
            cc.setTitular(sc.nextLine());
            System.out.println("Informe o CPF:");
            cc.setCpf(sc.nextLine());

        do{
            System.out.println("\n------------MENU PRINCIPAL-------------");
            System.out.println("1 - EXIBIR INFORMAÇÕES");
            System.out.println("2 - DEPOSITO");
            System.out.println("3 - SAQUE");
            System.out.println("4 - SAIR DO PROGRAMA!");
            option = sc.nextInt();

            switch(option){
                case 1: 
                    cc.showInfo();
                    break;
                    
                case 2: 
                    System.out.printf("Informe o valor que deseja depositar: ");
                    valor = sc.nextDouble();
                    System.out.println((valor > 0) ? "Deposito realizado com sucesso! R$ "+valor : "Valor invalido para depósito!");
                    cc.depositar(valor);
                    System.out.println("\nSaldo: R$ "+cc.getSaldo());
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja sacar: ");
                    valor = sc.nextDouble();
                    System.out.println((valor > 0 && valor <= cc.getSaldo()) ? "Saque efetuado com sucesso. Saldo: R$ " + cc.sacar(valor) : "Valor do saque inválido.");
                    cc.sacar(valor);
                    System.out.println("\nSaldo: R$ "+cc.getSaldo());
                    break;

                case 4:
                    System.out.println("Saindo do programa!");
                default:
                    System.out.println("Opção invalida!");
            }

        }while (option !=4);

        sc.close();
    }
}
