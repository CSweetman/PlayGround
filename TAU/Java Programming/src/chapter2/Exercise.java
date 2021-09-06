package chapter2;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String adj;
        String season;
        int numOfCups;
        System.out.println("Insert an adjective");
        adj = in.nextLine();
        System.out.println("Insert your favorite season of the year");
        season = in.nextLine();
        System.out.println("Insert a whole number");
        numOfCups = in.nextInt();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + numOfCups
        + " cups of coffee");
    }
}
