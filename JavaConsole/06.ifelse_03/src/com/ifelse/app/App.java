package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String name;
        double nota;

        System.out.println("Informe o nome:");
        name = sc.nextLine();
        System.out.println("Informe a nota:");
        nota = sc.nextInt();

        if(nota >= 7){
            System.out.println("O Aluno, "+name+" está aprovado!\nNota: "+nota);
        }
        else if(nota >= 5){
            System.out.println("O Aluno, "+name+" está de Recuperação!\nNota: "+nota);

        }else{
            System.out.println("O Aluno, "+name+" está  reprovado!");
        }





        sc.close();

    }
}
