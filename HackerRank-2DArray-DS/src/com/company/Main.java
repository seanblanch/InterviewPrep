package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        int[][] twoDementionalArray = new int[6][6];

        //Fill the grid
        for (int row = 0; row < twoDementionalArray.length; row++) {
            for (int col = 0; col < twoDementionalArray[row].length; col++) {

                twoDementionalArray[row][col] = rand.nextInt(10);
            }
        }

        //display output
        for(int i=0;i<twoDementionalArray.length; i++)
        {
            for(int j=0; j<twoDementionalArray[i].length; j++)
                System.out.print(twoDementionalArray[i][j]+" ");
            System.out.println();
        }

        int numberCounter = 0;
        //Set the max to -63 because that is the lowest possible value looking at the constraints
        int max = -63;

        for(int i=0;i<twoDementionalArray.length; i++)
        {
            for(int j=0; j<twoDementionalArray[i].length; j++)
            {
                if((j+2) < 6 && (i+2) < 6)
                {
                    //System.out.print(twoDementionalArray[i][j] + " ");
                    numberCounter = twoDementionalArray[i][j] + twoDementionalArray[i][j + 1] + twoDementionalArray[i][j + 2] +
                            twoDementionalArray[i + 1][j + 1] +
                            twoDementionalArray[i + 2][j] + twoDementionalArray[i + 2][j + 1] + twoDementionalArray[i + 2][j + 2];
                    System.out.print(numberCounter + "|");
                    if (max < numberCounter)
                    {
                        max = numberCounter;
                    }
                }
            }
        }
        System.out.println("\n" + max + " Is the Maximum hourglass sum");
    }
}
