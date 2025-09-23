package com.list.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Informe o "+ (i+1)+ "º nome:");
            names[i] = sc.nextLine();
        }

        for (String name : names){
            System.err.println(names);
        }

        sc.close();


}
}