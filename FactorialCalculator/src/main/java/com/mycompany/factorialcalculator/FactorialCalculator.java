package com.mycompany.factorialcalculator;
import java.util.Scanner;


public class FactorialCalculator {
    static String printString = "";
    static int number = 0;
    
    public static void main(String[] args){
        System.out.println("<------ Factorial Calculator ------>");
        
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 10){
            System.out.println("Enter a positive integer: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Invalid input! Program stopped!");
                System.exit(0); }
            int num = number;
            int factorial = factorial(num);
            System.out.println (number + "! = " + printString);
            System.out.println ("Factorial of " + number + " is: " + factorial);
            count++;
        }
    }
    private static int factorial (int num) {
        if (num == 0) {
            return 1; }
        else {
            if (num == number) {
                printString = String.valueOf(number);}
            else{
                printString = num + " x " + printString;
            }
            num = num * factorial (num - 1);
            return num;
        }
    
    }
}

        