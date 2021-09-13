/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        double amount;
        double taxed_amount = 0;
        double tax = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("What is order amount? ");
        amount = input.nextDouble();
        System.out.print("What state do you live in? ");
        String state = input.next();

        if (state.equals("Wisconsin"))
        {
            System.out.print("What county do you live in? (Please do not insert spacing. Ex. Type Eau Claire as EauClaire): ");
            String county = input.next();
            if (county.equals("EauClaire"))
            {
                tax = (amount * 5.005) / 100;
                taxed_amount = tax + amount;
            }
            else if (county.equals("Dunn"))
            {
                tax = (amount * 5.004) / 100;
                taxed_amount = tax + amount;
            }
            else
            {
                System.out.println("Invalid county.");
            }
        }
        else if (state.equals("Illinois"))
        {
            tax = (amount * 8) / 100;
            taxed_amount = tax + amount;
        }
        else
        {
            tax = 0.0;
            taxed_amount = amount;
        }
        System.out.println("The tax is $" + String.format("%.2f", tax) +"." + "\r\n" + "The total is $" + String.format("%.2f", taxed_amount) + ".");

    }
}


