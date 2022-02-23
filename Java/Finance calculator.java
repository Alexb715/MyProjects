package com.alexandre
import java.text.NumberFormat;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
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
    String start;
    String whatTheyWantToDo;
        System.out.println("welcome to finance calculator");
        System.out.print("would you like to begin Yes or No: ");

    do {


        start = scanner.next().toLowerCase();
            if(start.equals("yes")){
                System.out.println("what would you like to do");
                System.out.print("Mortgage calculator, Vehicle Payment Calculator or Interest Calculator : ");
                whatTheyWantToDo = scanner.next().toLowerCase();

                switch (whatTheyWantToDo){
                    case "mortgage","mortgage calculator" :
                        System.out.println("Welcome to mortgage calculator");
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


                        break;
                        // end mortgage calculator
                    case "vehicle calculator", "vehicle payment calculator", "vehicle" :
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


                        break;
                    case "interest", "interest calculator":
                        System.out.println("Welcome To Interest Calculator");
                        System.out.print("What is the amount of your Loan: ");
                        principle = scanner.nextInt();

                        System.out.print("what is your interest rate: ");
                        float interestRate = scanner.nextFloat()/PERCENT;

                        System.out.print("and for how many years: ");
                        float amountOfYears = scanner.nextFloat();

                        System.out.println("How Many Times do you pay per year: ");
                        period = scanner.nextInt();


                        double totalAmount;
                        totalAmount = principle *
                                Math.pow(1+(interestRate/ period ),(amountOfYears*period));
                       totalAmount = totalAmount - principle;
                        mortgageFormatted = currency.format(totalAmount);
                        System.out.println("total amount of interest paid is " + mortgageFormatted);




                        break;

                    default:
                        System.out.println("INVALID CHOICE PLEASE TRY AGAIN");
                }
                //end of switch
                System.out.print("would you like to continue: ");
            }
        //end of if

    }
    while (start.equals("yes"));
        if (start.equals("no")){
            System.out.println("thanks for using me");
        }
    }
}
