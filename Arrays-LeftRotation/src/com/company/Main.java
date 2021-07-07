// Sean Blanchard
// 7/7/2021
//Interview Prep
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of numberOfRotationss: ");
        int numberOfRotations = scan.nextInt();
        int sizeOfArray = 20;
        int index = sizeOfArray - numberOfRotations;
        //Create the size of the first array
        //based off of the size of rotations
        int[] firstArray = new int[index];

        for(int i = 0; i < firstArray.length; i++)
        {
            firstArray[i] = i + numberOfRotations + 1;
        }

        for (int i = 0; i < firstArray.length; i++)
        {
            System.out.printf(firstArray[i] + " ");
        }

        //Store the first 'numberOfRotations' elements in a temp array
        int[] tempArray = new int[numberOfRotations];
        //Iterate over the number of rotations
        for (int i = 0; i < numberOfRotations; i++)
        {
            //add the values from the original array
            //to the tempArray based on how many
            //rotations are entered by user
            tempArray[i] = i + 1;
        }

        //Print the tempArray at the end to place
        //the values at the end
        for (int i = 0; i < tempArray.length; i++)
        {
            System.out.printf(tempArray[i] + " ");
        }

    }
}
