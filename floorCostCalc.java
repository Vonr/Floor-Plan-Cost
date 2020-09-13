package com.company;
import java.util.Scanner;

class Main {

    public static void Welcome(){
        System.out.println("This program is used to calculate the cost of a tiled floor.");
    }

    public static void tileEquation(){
        System.out.println("Please enter the cost of one tile.");

        Scanner scan = new Scanner(System.in);
        double tileCost = scan.nextDouble();
        System.out.println("How many tiles are there lengthwise?");

        double length = scan.nextDouble();
        System.out.println("How many tiles are there width wise?");

        double width = scan.nextDouble();

        double tileArea = length * width;
        double grandTotal = tileCost * tileArea;

        System.out.println("Your floor would cost " + grandTotal);
    }

    public static void main(String[] args) {
	Welcome();
	try {
        while (true) {
            tileEquation();
        }
    } catch(Exception e) {
        System.out.println("There was a problem with one of your inputs. Please re-run the program.");
    }
    }
}
