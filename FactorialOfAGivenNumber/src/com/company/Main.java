package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.printf("Please enter a number to find the factorial: ");
        int finalNumber = 1;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++)
        {
            finalNumber *= i;
        }
        System.out.println("The Factorial of " + number + " is: " + finalNumber);
    }
}
