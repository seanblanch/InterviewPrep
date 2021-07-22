package com.company;

//Write a program that reads a character from the keyboard and detects if the given character is a letter


import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a single character. ");
        char input = scanner.next().charAt(0);
        boolean characterReader = Character.isLetter(input);
        System.out.println("The character '" + input + "' is a letter : " + characterReader);
    }
}
