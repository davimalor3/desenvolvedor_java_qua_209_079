package com.atividade2.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int age, option, salas;
        boolean authorize = false;
        
        do{
            System.out.println("Informe seu nome:");
            name = sc.nextLine();
            System.out.println("Informe sua idade:");
            age = sc.nextInt();
            sc.nextLine();
            
            System.out.println("SALA 1 - RESIDENT EVIL (+18)");
            System.out.println("SALA 2 - PEPPA PIG (LIVRE)");
            System.out.println("SALA 3 - CORALINE (+7)");
            System.out.println("SALA 4 - VELOZES FURIOSOS (+18)");
            System.out.println("SALA 5 - HARRY POTTER (+12)");
            salas = sc.nextInt();



            switch(salas){
                case 1:
                    if (age >= 18) authorize = true;
                    break;

                case 2:
                    authorize = true;
                    break;

                case 3:
                    if (age >= 7) authorize = true;
                    break;

                case 4:
                    if (age >= 18) authorize = true;
                    break;

                case 5:
                    if (age >= 12) authorize = true;
                    break;
                    
                default:
                    break;
            }

            
        }while(option != 2 );


        sc.close();
    }
}
