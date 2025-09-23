package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Informe seu nome:");
        name = sc.nextLine();
        System.out.println("Informe sua idade:");
        age = sc.nextInt();

        System.out.println(name+ ((age >= 18) ? " é maior de idade!" : " é menor de idade!"));
        sc.close();

        
    }
}
