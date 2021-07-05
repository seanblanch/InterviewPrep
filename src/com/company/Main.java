package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the first number to compare: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please Enter the second number to compare: ");
        int secondNumber = scan.nextInt();

        if(firstNumber > secondNumber)
        {
            System.out.println(firstNumber + " is Larger than " + secondNumber);
        }
        else if (secondNumber > firstNumber)
        {
            System.out.printf(secondNumber + " is Larger than " + firstNumber);
        }
        else
        {
            System.out.println(secondNumber + " is equal to " + secondNumber);
        }
    }
}
