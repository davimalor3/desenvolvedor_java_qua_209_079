package com.atividade2.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int age, salas;
        boolean ticket, authorize, quit = false;

            System.out.println("Informe seu nome:");
            name = sc.nextLine();
            System.out.println("Informe sua idade:");
            age = sc.nextInt();
            sc.nextLine();
        
        do{
            // LISTA DE FILMES DISPONÍVEIS
            System.out.println("\nESCOLHA O FILME PARA ASSISTIR:\n");
            System.out.println("1 - RESIDENT EVIL (+18)");
            System.out.println("2 - PEPPA PIG (LIVRE)");
            System.out.println("3 - CORALINE (+7)");
            System.out.println("4 - VELOZES FURIOSOS (+18)");
            System.out.println("5 - HARRY POTTER (+12)");
            salas = sc.nextInt();
            
            //Garbage Collector
            sc.nextLine();

            
            String movie = "";
            ticket = false;
            quit = false;
            authorize = false;
            

            switch(salas){
                case 1:
                    movie = "RESIDENT EVIL";
                    if (age >= 18) authorize = true;
                    break;

                case 2:
                    movie = "PEPPA PIG";
                    authorize = true;
                    break;

                case 3:
                    movie = "CORALINE";
                    if (age >= 7) authorize = true;
                    break;

                case 4:
                    movie = "VELOZES E FURIOSOS";
                    if (age >= 18) authorize = true;
                    break;

                case 5:
                    movie = "HARRY POTTER";
                    if (age >= 12) authorize = true;
                    break;
                    
                default:
                    System.out.println("Opção Invalida!");
                    ticket = false;
                    quit = true;
            }
            
            if (authorize)
            {
                System.out.println("\nOlá "+name+" o ingresso para o filme: "+movie+" está liberado!\nAproveite o filme!\n");
                ticket = true;
            }

            else if(quit) System.out.println("Escolha novamente!");

            else System.out.println("\n\nDesculpe "+name+", classificação indicativa não atingida\nEscolha outro filme de acordo com sua classificação compatível\n\n");
            
            
        }while(!ticket);


        sc.close();
    }
}
