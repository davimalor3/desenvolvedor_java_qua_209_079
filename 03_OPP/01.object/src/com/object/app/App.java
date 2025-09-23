package com.object.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Person user = new Person("",0,0.0);

        System.out.println("Informe o nome:");
        user.name = sc.nextLine();
        System.out.println("Informe a idade:");
        user.age = sc.nextInt();
        System.out.println("Informe a altura:");
        user.height = sc.nextDouble();

        System.out.println(user.sayHello());
        user.showInfo();
        sc.close();
    }
}
