package finalproject;

import java.util.Scanner;

/**
 * file: Main.java Author: Kenny Yang Date: 11/6/16 Purpose: Main loop for user
 * to request statistics
 */
public class Main {

    public static void main(String[] args) {
        String userInput = "";
        Scanner scannerIn = new Scanner(System.in);
        Statistics stats = new Statistics(ImportData.process());

        OUTER:
        while (true) {
            System.out.println("1. What were the percentages in population growth for"
                    + " each consecutive year from 1994-2013?");
            System.out.println("2. What year was the murder rate the highest?");
            System.out.println("3. What year was the murder rate the lowest?");
            System.out.println("4. What year was the robbery rate the highest?");
            System.out.println("5. What year was the robbery rate the lowest?");
            System.out.println("6. What was the total percentage change in Motor "
                    + "Vehicle Theft from 1998  and 2012");
            System.out.println("7.  What year was the violent crime the highest?");
            System.out.println("8. What year was the lowest larceny-theft?");
            System.out.println("Q. Quit the program");
            userInput = scannerIn.next();

            switch (userInput) {
                case "Q":
                case "q":
                    break OUTER;
                case "1":
                    for (int i = 0; i < 19; i++) {
                        System.out.println(String.format("%d-%d: %.2f%%", (i+1994), (i+1995), stats.getEveryPopulationGrowth()[i]));
                    }
                    break;
                case "2": // print highest murder rate
                    System.out.println("The year with the highest Murder Rate was " + stats.getMaxMurderRateYear());
                    break;
                case "3": // print lowest murder rate
                    System.out.println("The year with the lowest Murder Rate was " + stats.getMinMurderRateYear());
                    break;
                case "4": // print highest robbery rate
                    System.out.println("The year with the highest Robbery Rate was " + stats.getMaxRobberyRateYear());
                    break;
                case "5": // print lowest robbery rate
                    System.out.println("The year with the lowest Robbery Rate was " + stats.getMinRobberyRateYear());
                    break;
                case "6": // print total percentage change in vehicle theft from 1998 - 2012
                    System.out.println(String.format("The total percentage change in vehicle theft from 1998 - 2012 is %.2f%%", stats.getVehicleTheftPercentageChange()));
                    break;
                case "7": // print year with highest violence
                    System.out.println("The year with the lowest violence is " + stats.getMaxViolentYear());
                    break;
                case "8": // print year with the lowest larceny-theft rate
                    System.out.println("The year with the lowest Larceny Theft is " + stats.getMinLarcenyTheftYear());
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
