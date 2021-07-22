import java.util.Scanner;
import java.text.DecimalFormat;

public class Q3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item price as double (i.e. 1.25): ");
        double itemPrice = scanner.nextDouble();
        System.out.println("Enter bill value as int (i.e. 1 for $1 bill): ");
        double billValue = scanner.nextDouble();

        double changeDue = billValue - itemPrice;

        System.out.println("For the item price of $" + itemPrice + " the change due out of $" + billValue + " is $" + changeDue + " :");

        double halfDollar = .50;
        double quarter = .25;
        double dime = .10;
        double nickel = 0.05;
        double penny = 0.01;

        double halfDollarReturn = (int)(changeDue / halfDollar);
        System.out.println(halfDollarReturn + " = halfDollarReturn");
        double halfDollarSum = halfDollarReturn * halfDollar;
        System.out.println(halfDollarSum + " = halfDollarSum");
        double changeDueAfterHalfDollars = changeDue - halfDollarSum;
        System.out.println(changeDueAfterHalfDollars + " is change due after half dollars");
        double quarterReturn = (int)(changeDueAfterHalfDollars / quarter);
        double quarterSum = quarterReturn * quarter;
        double quarterDueAfterHalfDollars = changeDueAfterHalfDollars - quarterSum;
        double dimeReturn =(int) (quarterDueAfterHalfDollars / dime);
        double dimeSum = dimeReturn * dime;
        double dimeDueAfterHalfDollars = quarterDueAfterHalfDollars - dimeSum;
        double nickelReturn = (int) (dimeDueAfterHalfDollars / nickel);
        double nickelSum = nickelReturn * nickel;
        double nickelDueAfterHalfDollars = dimeDueAfterHalfDollars - nickelSum;
        double pennyReturn = nickelDueAfterHalfDollars / penny;

        //Use DecimalFormat to tell java where to have the last decimal
        //("0.00") = 1.00, ("0") = 1, ("0.0000") = 1.0000, etc...
        DecimalFormat f = new DecimalFormat("0");

        System.out.print(f.format(halfDollarReturn) + " half dollar coins; " + f.format(quarterReturn) + " quarter coins; ");
        System.out.print(f.format(dimeReturn) + " dime coins; " + f.format(nickelReturn) + " nickel coins; " + f.format(pennyReturn) + " penny coins;");

    }
}
