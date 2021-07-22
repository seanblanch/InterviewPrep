package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a phone number (ie 805-437-3236) ");
        String phoneNumber = scan.nextLine();
        System.out.println("You said: \"" + phoneNumber + "\"");

        String phoneNumberNoAreaCode = phoneNumber.substring(phoneNumber.indexOf("-", 2)+1);
        //System.out.println(phoneNumberNoAreaCode);

        String getMiddleNumber = phoneNumberNoAreaCode.substring(0, phoneNumber.indexOf("-"));
        //System.out.println(getMiddleNumber);

        String getLastNumber = phoneNumber.substring(phoneNumber.lastIndexOf("-")+1);
        //System.out.println(getLastNumber);

        System.out.println("The phone number " + phoneNumber + " without area code is: \"" + getMiddleNumber + " " + getLastNumber + "\"");

    }
}
