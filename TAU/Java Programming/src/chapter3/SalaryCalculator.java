package chapter3;
/*
* Multiline comments, comments can go anywhere
* All salespeople get a payment of $1000 a week
* Sales people who exceed 10 sales get an additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;

        //Get Values for the unknown
        System.out.println("How many sales have you made this week?");
        Scanner in = new Scanner(System.in);
        int sales = in.nextInt();
        in.close();
        //Quick detour for bonus earners
        if(sales > 10)    //condition that needs to be met, which is a boolean value, true/false
            salary+=bonus;  //Don't need to redeclare shit

        //Output
        System.out.println("You got paid $" + salary);

    }
}
