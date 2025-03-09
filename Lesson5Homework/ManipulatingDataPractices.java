package Lesson5Homework;

import java.util.Scanner;

public class ManipulatingDataPractices {
    public static void main(String[] args) {

//verificare numar par sau impar
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number = ");
        long number = scanner.nextLong();

        if (number != 0) {
            if (number % 2 == 0)
                System.out.println(number + " it is an even number");
            else
                System.out.println(number + " it is an odd number");


        }
    else

    {
        System.out.println("You entered zero, which is neither even nor odd.");
    }

//Write a Java program that reads a floating-point number. If the number is zero it prints "zero",
// otherwise, print "positive" or "negative". Add "small" if the absolute value of the number
// is less than 1, or "large" if it exceeds 1,000,000.
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a floating-point number = ");
        float number1 = scanner.nextLong();

        if (number1 != 0) {
            if (number >= 0)
                System.out.println(number + " it is a positive number");
            if (number >= 0)
                System.out.println(number + " it is a negative number");


        }
        else

        {
            System.out.println("You entered zero, which is neither even nor odd.");
        }
}
}
