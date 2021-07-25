//Sean Blanchard
//7/25/2021

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your school email");
        String email = scanner.nextLine();

        String studentEmailParser = "[a-z]+[.][a-z]+[0-9]{3}[@][myci]+[.][csuci.edu]+";
        String domainEmailParser = "[a-z]+[.][a-z]+[0-9]{3}[@][mydomain]+[.][csuci.edu]+";
        String staffEmailParser = "[a-z]+[.][a-z]+[@][csuci.edu]+";


        if (email.matches(studentEmailParser))
        {
            System.out.println("The entered email " + email + " is valid Domain csuci indicates student email.");
        }
        else if (email.matches(domainEmailParser))
        {
            System.out.println("The entered email " + email + " is valid Domain \"mydomain.csuci\" indicates unknown email.");
        }
        else if (email.matches(staffEmailParser))
        {
            System.out.println("The entered email " + email + " is valid Domain csuci indicates staff email.");
        }
        else
        {
            System.out.println("The entered input " + email + " is NOT a valid email.");
        }


    }
}
