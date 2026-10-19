/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peoparttwo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PeoPartTwo {

    /**
     */
  
        // TODO code application logic here
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Message msg = new Message();
        Scanner scan = new Scanner(System.in);

        int option;
        do {
            System.out.println("\n===== Select any of the options below =====");
            System.out.println("1.Send message");
            System.out.println("2.Coming soon");
            System.out.println("3.Exit");

            option = scan.nextInt();

            switch (option) {
                case 1 -> msg.sendingMessages();
                
                case 2 -> System.out.println("Coming soon");
                
                case 3 -> System.out.println("Goodbye!!");
                case 4 ->
                 System.out.println("Invalid option");
                
                default -> {
                    return;
                }
            }

        } while (option != 3);
    }
    }


        
               

