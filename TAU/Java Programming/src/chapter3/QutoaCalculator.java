package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */


import java.util.Scanner;

public class QutoaCalculator {
    public static void main(String[] args){
        //Initialize val
        int quota = 10;

        //Get vals we don't
        System.out.println("How many sales have you made this week");
        Scanner in = new Scanner(System.in);
        int sales = in.nextInt();
        in.close();

        //Make decision on output
        if(sales >= 10)
            System.out.println("Congratulations!");
        else
            System.out.println("You did not meet the quota of 10 sales by: " + (quota-sales) + " sales.");
    }
}
