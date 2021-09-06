package chapter3;
import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

public class LoanQualifier {
    public static void main(String args[]){
        //Initialize what we know
        int reqMoney = 30000;
        int reqYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary");
        Scanner in = new Scanner(System.in);
        double clientSal = in.nextDouble();

        System.out.println("Enter how long you have worked for your job in years");
        double clientYears = in.nextInt();
        in.close();

        //Make decision
        if(clientSal > reqMoney){
            if(clientYears > reqYearsEmployed)
                System.out.println("Here is your loan");
            else
                System.out.println("Sorry, you must have worked for at least " + reqYearsEmployed + " years");
        }
        else
            System.out.println("Sorry, your salary must be at least $" +reqMoney);
    }
}
