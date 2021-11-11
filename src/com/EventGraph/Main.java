/*
* Laboratory work #4. Platonov Ivan, group 02121-DB, IMIT ISU.
* Block "Hello, world!"
* */
package com.EventGraph;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //The first task, just printing the given text
	    System.out.println("Hello, world!");

        //The second task
        //Create a Scanner object class from java.util.Scanner for getting user input
        Scanner sc = new Scanner(System.in);

        //Read the next line as a string
        String UserInput = sc.next();

        //Print the line onto console
        System.out.println(UserInput);

        //The fird task
        //Ask a user to enter his number
        System.out.println("Enter your number: ");
        //Read the next line as an integer
        int Number = sc.nextInt();
        //Print the power of two of this number using Math.pow()
        System.out.printf("The number in power of two is %f \n", Math.pow(Number, 2));

        //The fourth task
        //Ask a user to enter some year
        System.out.println("Enter some year: ");
        //Read the next line as an integer
        int Year = sc.nextInt();

        //Check the condition that is year leap or not
        if(Year % 4 == 0)
        {
            //Print that year is leap
            System.out.println("This year is leap!");
        }
        else
        {
            //Print that year is not leap
            System.out.println("This year is not leap!");
        }

    }
}
