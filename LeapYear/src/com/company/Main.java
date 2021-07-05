package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the year to determine whether that year is a leap year: ");
        int year = scan.nextInt();

        //Leap Years are any year that can be exactly divided by 4 (such as 2016, 2020, 2024, etc)
        if (year % 4 == 0)
        {
            //except if it can be exactly divided by 100, then it isn't (such as 2100, 2200, etc)
            //except if it can be exactly divided by 400, then it is (such as 2000, 2400)
            if(year % 100 != 0)
            {
                System.out.println(year + " is a leap year!");
            }
            else if(year % 400 == 0)
            {
                System.out.println(year + " is a leap year!");
            }
            else
            {
                System.out.println(year + " is not a leap year!");
            }
        }
        else
        {
            System.out.println(year + " is not a leap year!");
        }
    }
}
