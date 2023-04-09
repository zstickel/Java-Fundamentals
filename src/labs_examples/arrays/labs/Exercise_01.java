package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[10];
        for (int i=0;i<10;i++){
            System.out.println("Enter a number");
            inputs[i] = scanner.nextLine();
        }

        int sum = 0;
        for (String input : inputs){
            sum += Integer.parseInt(input);
        }
        double sumAsDouble = sum;
        double average = sumAsDouble / inputs.length;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }
}