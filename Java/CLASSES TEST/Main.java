package com.alexandre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Mortgage_calculator mortgage_calculatorObject = new Mortgage_calculator();
        Vehicle vehicleObject = new Vehicle();
        String choice = new String();
        Scanner scanner = new Scanner(System.in);






        System.out.print("what would you like to do: ");
        choice = scanner.next().toLowerCase();


        if (choice.equals("m")) {
            mortgage_calculatorObject.Calculator();

        }
        if (choice.equals("v")){
            vehicleObject.calculator();

        }

        else {
            System.out.println("incorrect choice");

        }
        System.out.println("thanks for using");
    }
}
