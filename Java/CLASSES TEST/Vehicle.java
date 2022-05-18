package com.alexandre;
import java.text.NumberFormat;
import java.util.Scanner;
public class Vehicle {
    public void calculator(){
        Scanner scanner = new Scanner(System.in);
        byte MONTHS_IN_A_YEAR = 12;
        byte PERCENT = 100;
        float period;
        int principle ;
        float amountOfMonths ;
        int msrpOfCar ;
        int downPayment ;
        double mortgage ;
        float monthlyInterestRate;
        String mortgageFormatted;
        NumberFormat currency = NumberFormat.getCurrencyInstance();


        System.out.println("Welcome To vehicle Payment Calculator");

        System.out.print("What is the price of the vehicle: ");
        msrpOfCar = scanner.nextInt();

        System.out.print("what is the down payment that you are putting on it: ");
        downPayment = scanner.nextInt();

        principle = msrpOfCar - downPayment;

        System.out.print("What is your annual interest rate: ");
        monthlyInterestRate = scanner.nextFloat() /PERCENT/MONTHS_IN_A_YEAR;

        System.out.print("How Many years are you Financing it for: ");
        amountOfMonths = scanner.nextFloat() * MONTHS_IN_A_YEAR;

        //math part
        mortgage = principle *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,amountOfMonths)) /
                (Math.pow(1+monthlyInterestRate,amountOfMonths) - 1);
        mortgageFormatted = currency.format(mortgage);

        System.out.println("your monthly car payments are " + mortgageFormatted + " per month");



    }

}
