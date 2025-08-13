package com.encapsulation.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();

        System.out.println("Informe o nome:");
        p1.setName(sc.nextLine());
        System.out.println("Informe a idade:");
        p1.setAge(sc.nextInt());
        
        System.out.println("Nome: "+ p1.getName());
        System.out.println("Idade: "+p1.getAge());


        sc.close();
    }
}
