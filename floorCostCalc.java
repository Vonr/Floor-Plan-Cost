package com.company;
import java.util.Scanner;

class Main {

    public static void tileEquation(){
        try {
            System.out.println("Please enter the cost of one tile.");

            Scanner scan = new Scanner(System.in);
            double grandTotal = scan.nextDouble();
            System.out.println("How many tiles are there lengthwise?");

            grandTotal *= scan.nextInt();
            System.out.println("How many tiles are there width wise?");

            // Would be better to use DecimalFormat. 
            grandTotal = ((int) (grandTotal * scan.nextInt() * 100.0)) / 100.0;

            System.out.println("Your floor would cost " + grandTotal);
        } catch (Exception ignored) {
            System.out.println("An unexpected error has occured.\nIt is likely that you inputted a value that doesnt belong somewhere.");
        }
    }

    public static void main(String[] args) {
	System.out.println("This program is used to calculate the cost of a tiled floor.");
	while (true) {
            tileEquation();
        }
    }
}
