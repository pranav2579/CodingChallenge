package thirtydaysofcode;

import java.util.Scanner;
public class Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tip = mealCost*((double)tipPercent/(double)100);
        double tax = mealCost*((double)taxPercent/(double)100);

        double total = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}