package com.company;

//Time Complexity: O(n)
//Iterative

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        int N = 60;

        //Call Function
        Fibonacci(N);
    }

    static void Fibonacci(int N)
    {
        int numberOne = 0;
        int numberTwo = 1;
        int newNumber = 0;
        int counter = 0;

        while (counter < N)
        {
            System.out.print(numberOne + " ");

            //Swap
            newNumber = numberTwo + numberOne;
            numberOne = numberTwo;
            numberTwo = newNumber;
            counter++;
        }
    }
}
