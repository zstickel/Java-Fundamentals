package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */
import java.util.Scanner;
import java.util.Arrays;
public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number from 1 to 10:");
        String userNumberString = scanner.nextLine();
        int userNumber = Integer.parseInt(userNumberString);
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        System.out.println("User number: " + userNumber);
        int index = 0;
        int location = -1;
        for (int num : array){
            if (num == userNumber){
                location = index;
            }
            index ++ ;
        }
        System.out.println("Index is: " + location);
    }
}