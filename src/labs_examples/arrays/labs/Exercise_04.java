package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {


    public static void main(String[] args) {
        int [][] irregularArray = new int [10][];
        for (int i= 0; i < irregularArray.length; i++){
            irregularArray[i] = new int [i+1];
            for(int j = 0; j< irregularArray[i].length; j++){
                irregularArray[i][j] = j;
            }
        }
        for (int[] innerArray : irregularArray){
            System.out.println(Arrays.toString(innerArray));
        }
    }

}
