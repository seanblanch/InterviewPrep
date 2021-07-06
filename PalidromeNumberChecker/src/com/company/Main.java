package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter a number to check if it is a Palindrome Number: ");
        int number = scan.nextInt();
        int reversedNum = 0;
        int remainder = 0;
        //Store the number to original
        int ogNumber = number;

        while (number != 0)
        {
            remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }

        if(ogNumber == reversedNum)
        {
            System.out.printf(ogNumber + " is a Palindrome.");
        }
        else
        {
            System.out.printf(ogNumber + " is not a Palindrome.");
        }

    }
}
