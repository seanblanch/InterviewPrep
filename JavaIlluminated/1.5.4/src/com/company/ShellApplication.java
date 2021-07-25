package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ShellApplication {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Programming is not a spectator sport!");

        //System.exit(0);
        //This is a comment

        String s = "A" + "BC" + "DEF" + "GHIJ";
        s = s.toLowerCase();
        System.out.println(s);

        double f = 5.7;
        long i = Math.round(f);
        System.out.println(i);

        String str = "Hello World";
        int counter = str.length();
        System.out.println(counter);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String input = scanner.nextLine();
        int inputCounter = input.length();
        System.out.println(input + " Has " + inputCounter + " characters.");
    }
}
