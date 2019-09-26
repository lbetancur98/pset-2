/**
 * Problem Set 2.
 * 
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        System.out.print("Enter your first name: ");
        String firstName = in.next();
        in.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = in.next();
        in.nextLine();

        System.out.print("Enter your grade: ");
        int grade = in.nextInt();
        in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Enter your hometown: ");
        String hometown = in.next();
        in.nextLine();

        System.out.println("\nNAME     :" + firstName + " " + lastName);
        System.out.println("GRADE    :" + grade);
        System.out.println("AGE      :" + age);
        System.out.println("HOMETOWN :" + hometown);
        
        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

        System.out.print("Enter a dollar amount: ");
        double amountMoney = in.nextDouble() * 100;
        in.nextLine();

        double dollarValue = 100;
        double quarterValue = 25;
        double dimeValue = 10;
        double nickelValue = 5;
        
        double dollarAmount = Math.floor(amountMoney / dollarValue);

        amountMoney = amountMoney - (dollarAmount * dollarValue);

        

        double quarterAmount = Math.floor(amountMoney / quarterValue);

        amountMoney = amountMoney - (quarterAmount * quarterValue);

        

        double dimeAmount = Math.floor(amountMoney / dimeValue);

        amountMoney = amountMoney - (dimeAmount * dimeValue);


        double nickelAmount = Math.floor(amountMoney / nickelValue);

        amountMoney = amountMoney - (nickelAmount * nickelValue);


        System.out.printf("DOLLARS:    %.0f\n", dollarAmount );
        System.out.printf("QUARTERS:   %.0f\n", quarterAmount);
        System.out.printf("DIME:   %.0f\n", dimeAmount);
        System.out.printf("NICKEL:   %.0f\n", nickelAmount);
        System.out.printf("PENNIES:   %.0f\n", amountMoney);

        /*
         * Exercise 3.
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

        
        System.out.print("Enter a dollar amount: ");
        double amountMoney = in.nextDouble() * 100;
        in.nextLine();

        
        double tenDollarValue = 1000;
        double fiveDollarValue = 500;
        double dollarValue = 100;
        double quarterValue = 25;
        double dimeValue = 10;
        double nickelValue = 5;

        double tenDollarAmount = Math.floor(amountMoney / tenDollarValue);
        amountMoney = amountMoney - (tenDollarAmount * tenDollarValue);

        double fiveDollarAmount = Math.floor(amountMoney / fiveDollarValue);
        amountMoney = amountMoney - (fiveDollarAmount * fiveDollarValue);
        
        double dollarAmount = Math.floor(amountMoney / dollarValue);
        amountMoney = amountMoney - (dollarAmount * dollarValue);

        double quarterAmount = Math.floor(amountMoney / quarterValue);
        amountMoney = amountMoney - (quarterAmount * quarterValue);

        double dimeAmount = Math.floor(amountMoney / dimeValue);
        amountMoney = amountMoney - (dimeAmount * dimeValue);

        double nickelAmount = Math.floor(amountMoney / nickelValue);
        amountMoney = amountMoney - (nickelAmount * nickelValue);


        double bills = tenDollarAmount + fiveDollarAmount + dollarAmount;
        double coins = quarterAmount + dimeAmount + nickelAmount + amountMoney;
        System.out.printf("BILLS : %.0f\n", bills );
        System.out.printf("COINS : %.0f\n", coins);

        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

        System.out.print("Enter a number of inches: ");
        double amountInches = in.nextDouble() ;
        in.nextLine();
  
        double mileValue = 63360;
        double yardValue = 36;
        double feetValue = 12;
       
        double mileAmount = Math.floor(amountInches / mileValue);
        amountInches = amountInches - (mileAmount * mileValue);

        double yardAmount = Math.floor(amountInches / yardValue);
        amountInches = amountInches - (yardAmount * yardValue);

        double feetAmount = Math.floor(amountInches / feetValue);
        amountInches = amountInches - (feetAmount * feetValue);

        System.out.printf("MILES  : %.0f\n", mileAmount );
        System.out.printf("YARDS  : %.0f\n", yardAmount);
        System.out.printf("FEET   : %.0f\n", feetAmount);
        System.out.printf("INCHES : %.0f\n", amountInches);

        
        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        

        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        


        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        

        
        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        

        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}