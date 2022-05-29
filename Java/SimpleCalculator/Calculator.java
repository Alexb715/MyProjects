package com.alexandre;

import javax.swing.*;


public class Calculator {
    private  JPanel topField;
    private JPanel mainPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a7Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton plusButton;
    private JButton minusButton;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JTextField screen;
    private JButton equalButton;
    private JButton a4Button;
    private JButton a0Button;
    private JButton clearButton;
    private JButton divideButton;
    private JButton multiplyButton;
    long firstnumber;
    long secondNumber;
    Object action = "invalid";
    String currentNumber;
    long result;

    //button1
    public Calculator() {
        a1Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "1");


        });
        //Button2
        a2Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "2");

        });
        //Button3
        a3Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "3");

        });
        a4Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "4");

        });
        a5Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "5");

        });a6Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "6");
        });a7Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "7");

        });a8Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "8");
        });a9Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "9");
        });
        a0Button.addActionListener(e -> {
            currentNumber = screen.getText();
            screen.setText(currentNumber + "0");
        });
        clearButton.addActionListener(e -> {
            secondNumber = 0;
            firstnumber = 0;
            screen.setText("");
            action = "invalid";

        });
        plusButton.addActionListener(e -> {

            if (screen.getText().matches("[0-9 -]+")){
            firstnumber = Long.parseLong( screen.getText());
            screen.setText("");
            action = "+";
                }
            else {
                screen.setText("INVALID");
            }
        });
        minusButton.addActionListener(e -> {
            if (screen.getText().matches("[0-9 -]+")){
                firstnumber = Long.parseLong( screen.getText());
                screen.setText("");
                action = "-";
            }
            else {
                screen.setText("INVALID");
            }

        });
        multiplyButton.addActionListener(e -> {
            if (screen.getText().matches("[0-9 -]+")){
                firstnumber = Long.parseLong( screen.getText());
                screen.setText("");
                action = "*";
            }
            else {
                screen.setText("INVALID");
            }
        });
        divideButton.addActionListener(e -> {
            if (screen.getText().matches("[0-9 -]+")){
                firstnumber = Long.parseLong( screen.getText());
                screen.setText("");
                action = "/";
            }
            else {
                screen.setText("INVALID");
            }
        });
        equalButton.addActionListener(e -> {
if( action.equals("+")){
    secondNumber = Long.parseLong(screen.getText());
    result = firstnumber + secondNumber;
    firstnumber = 0;
    secondNumber = 0;
    screen.setText(String.valueOf(result));
}
            if( action.equals("-")){
    secondNumber = Long.parseLong(screen.getText());
    result =firstnumber -secondNumber;
    firstnumber = 0;
    secondNumber = 0;
    screen.setText(String.valueOf(result));
}
            if( action.equals("/")){
    secondNumber = Long.parseLong(screen.getText());
    if (secondNumber < 0){
        screen.setText("Math ERROR");
    }
    if (secondNumber >= 0) {
        result = firstnumber / secondNumber;
        firstnumber = 0;
        secondNumber = 0;
        screen.setText(String.valueOf(result));
    }
}
            if( action.equals("*")){
    secondNumber = Long.parseLong(screen.getText());
    result = firstnumber * secondNumber;
    firstnumber = 0;
    secondNumber = 0;
    screen.setText(String.valueOf(result));
}
            else if (action == "invalid"){
                screen.setText("error");

            }


        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame(" Simple Calculator");
        frame.setContentPane(new Calculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}



