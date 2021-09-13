/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the principal amount? ");
        String Principal = scan.nextLine();

        System.out.print( "What is the rate? " );
        String Rate = scan.nextLine();

        System.out.print( "What is the number of years? " );
        String Years = scan.nextLine();

        System.out.print( "What is the number of times the interest is compounded per year? " );
        String Compound = scan.nextLine();

        // Calculations
        double dPrincipal = Double.parseDouble(Principal);
        double dRate = Double.parseDouble(Rate);
        double dYears = Double.parseDouble(Years);
        double dCompound = Double.parseDouble(Compound);

        // Using math.pow to calculate the power to 2
        double Interest = dRate / 100;
        double Total = dPrincipal * Math.pow((1 + Interest / dCompound),(dCompound * dYears));

        System.out.println("$" + String.format("%.2f", dPrincipal) + " invested at "+dRate+"% for "+Years+" years compounded " + String.format("%.0f", dCompound) + " times per year is $" + String.format("%.2f", Total) +".");
    }
}
