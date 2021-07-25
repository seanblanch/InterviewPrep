import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Please enter service code: ");
        char serviceCode = scanner.next().charAt(0);

        System.out.println("Please enter number of minutes: ");
        int numberOfMinutes = scanner.nextInt();

        switch (serviceCode)
        {
            //regular service
            case 'r':
                System.out.println();
                System.out.println("Account number: " + accountNumber);
                System.out.println("Service code: REGULAR");
                System.out.println("Minutes used :" + numberOfMinutes);

                double regularServiceCharge = 10.00;
                double regularCostPerMinute = 0.20;
                double totalRegularCharge = 0.0;
                int overusedRegularMinuted = 0;
                if(numberOfMinutes > 50)
                {
                    overusedRegularMinuted = numberOfMinutes - 50;
                    totalRegularCharge = regularServiceCharge + (regularCostPerMinute * overusedRegularMinuted);
                    System.out.println("Service charge : " + totalRegularCharge);
                }
                else
                {
                    System.out.println("Service charge : $10.00");
                }
                break;
            //Premium service
            case 'p':
                System.out.println("How many of the minutes are daytime minutes? ");
                int daytimeMinutes = scanner.nextInt();
                //Automatically calculate night time minutes
                int nighttimeMinutes = numberOfMinutes - daytimeMinutes;

                System.out.println();
                System.out.println("Account number: " + accountNumber);

                System.out.println("Service code: PREMIUM");
                System.out.println("Minutes used:" + numberOfMinutes);

                double premiumServiceCharge = 25.00;
                double premiumDayCostPerMinute = 0.10;
                double premiumNightCostPerMinute = 0.05;
                double totalPremiumDayCharge = 0.0;
                double totalPremiumNightCharge = 0.0;
                int overusedPremiumNightMinutes = 0;
                int overusedPremiumDayMinutes = 0;

                if(numberOfMinutes > 75)
                {
                    if( daytimeMinutes >= 75 && nighttimeMinutes <= 100 )
                    {
                        overusedPremiumDayMinutes = daytimeMinutes - 75;
                        totalPremiumDayCharge = premiumServiceCharge + (premiumDayCostPerMinute * overusedPremiumDayMinutes);
                        System.out.println("Service charge: " + totalPremiumDayCharge);
                    }
                    else if( nighttimeMinutes >= 100 && daytimeMinutes <= 75 )
                    {
                        overusedPremiumNightMinutes = nighttimeMinutes - 100;
                        totalPremiumNightCharge = premiumServiceCharge + (premiumNightCostPerMinute * overusedPremiumNightMinutes);
                        System.out.println("Service charge: " + totalPremiumNightCharge);
                    }
                    else if ( nighttimeMinutes >= 100 && daytimeMinutes >= 75 )
                    {
                        overusedPremiumDayMinutes = daytimeMinutes - 75;
                        overusedPremiumNightMinutes = nighttimeMinutes - 100;
                        totalPremiumDayCharge = premiumDayCostPerMinute * overusedPremiumDayMinutes;
                        totalPremiumNightCharge = premiumNightCostPerMinute * overusedPremiumNightMinutes;
                        double totalCombinedCharge = premiumServiceCharge + totalPremiumDayCharge + totalPremiumNightCharge;
                        System.out.println("Service charge: " + totalCombinedCharge);
                    }
                    else
                    {
                        System.out.println("Service charge: $25.00");
                    }
                }
                else
                {
                    System.out.println("Service charge : $25.00");
                }

                break;
            default:
                System.out.println("Invalid service code: " + serviceCode);
                break;
        }
    }
}
