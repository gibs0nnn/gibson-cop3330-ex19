package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

public class App 
{
    public static void main( String[] args )
    {
        //Get user input on weight/height
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        String strWeight = scanner.next();
        System.out.print("Enter your height in inches: ");
        String strHeight = scanner.next();

        if((!strWeight.matches("[0.0-9.0]+")) || (!strHeight.matches("[0.0-9.0]+"))) {
            System.out.println("Invalid input");
        } else {
            //String inputs to doubles
            double weight = Double.parseDouble(strWeight);
            double height = Double.parseDouble(strHeight);

            //Calculate BMI
            double bmi = (weight / (height * height)) * 703;

            //Conditional for determining weight range
            System.out.println("Your BMI is " + Math.round(bmi * 10.0) / 10.0 + ".");
            if(bmi < 18.5) {
                System.out.println("You are underweight. You should eat more.");
            } else if(bmi >= 18.5 && bmi <= 25) {
                System.out.println("You are within the ideal weight range.");
            } else {
                System.out.println("You are overweight. You should see a doctor.");
            }
        }
    }

}
