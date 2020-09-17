package com.Games;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome. Here you can solve the cost of a tiled floor. You can enter 0 to exit the program");
        while (true) {
            try {

            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter the cost of one tile.");
            double grandTotal = scan.nextDouble();

            if(grandTotal == 0){
                System.out.println("You are now going to exit the program in three seconds");

                TimeUnit.SECONDS.sleep(3);

                break;
            }

            System.out.println("\nEnter the Length of the floor.");
            grandTotal *= scan.nextDouble();

            System.out.println("\nEnter the width of the floor.");
            grandTotal *= scan.nextDouble();

            System.out.println("\nThe floor would cost " + grandTotal + " dollar(s).");

        } catch (Exception e){
            System.out.println("Something went wrong in the program.");
        }
        }
    }
}
