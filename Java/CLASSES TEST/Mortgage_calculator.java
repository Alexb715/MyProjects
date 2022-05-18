package com.alexandre;
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_calculator {
    public void Calculator() {
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

        System.out.println("welcome to mortgage calculator");
        System.out.print("What is the principle on the house: ");

        principle = scanner.nextInt();

        System.out.print("Alright next. What is your yearly interest rate: ");
        monthlyInterestRate = scanner.nextFloat() / PERCENT /MONTHS_IN_A_YEAR;

        System.out.print("finally For how many years are you financing: ");
        amountOfMonths = scanner.nextFloat() * MONTHS_IN_A_YEAR;

        //math part
        mortgage = principle *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,amountOfMonths)) /
                (Math.pow(1+monthlyInterestRate,amountOfMonths) - 1);
        mortgageFormatted = currency.format(mortgage);

        System.out.println("Your Monthly Mortgage Payment is " + mortgageFormatted);



    }
}
