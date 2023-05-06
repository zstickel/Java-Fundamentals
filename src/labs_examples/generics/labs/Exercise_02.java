package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Demo{
    public  <T extends Number> Double sum(ArrayList<T> list){
        Double sum = 0.0;
        for (T element : list){
            sum += element.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Demo newDemo = new Demo();
        ArrayList<Double> inputArrayList = new ArrayList<Double>(Arrays.asList(5.5,6.7,3.33,5.89));
        System.out.println(newDemo.sum(inputArrayList));
        ArrayList<Integer> inputArrayListTwo = new ArrayList<Integer>(Arrays.asList(7, 9, 11, 21));
        System.out.println(newDemo.sum(inputArrayListTwo).intValue());
    }
}