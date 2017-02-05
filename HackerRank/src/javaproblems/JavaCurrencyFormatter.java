package javaproblems;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Pranav on 05/02/17.
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        String USA = nf1.format(payment);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String india = nf2.format(payment);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf3.format(payment);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf4.format(payment);

        System.out.println("US: " + USA);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}


