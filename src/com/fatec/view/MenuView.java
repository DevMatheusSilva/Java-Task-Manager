package com.fatec.view;

import java.util.Scanner;

public class MenuView {

    public void mostrarOpcoes(){

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Welcome to Task Manager\n");
        System.out.println("1 - Create Task");
        System.out.println("10 - Exit");

        TaskView taskview = new TaskView();

        System.out.print("\nChoose an option: ");
        int opcao = sc.nextInt();

        switch (opcao){

            case 1:
                System.out.println("\nLet's create a task");
                taskview.createTask();
                break;
            case 10:
                System.out.println("Exiting...");
                sc.close();
                return;
            default:
                System.out.println("Invalid option!");
    
        }

    }

}