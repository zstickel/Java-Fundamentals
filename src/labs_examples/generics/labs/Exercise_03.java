package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03 {

    public static void main(String[] args) {
            String [] swappedArray = {"First","Second","Third", "Fourth", "Fifth"};
            Integer [] secondSwappedArray = {1,2,3,4,5};
            ArrayList<Integer> comparableList = new ArrayList<>(Arrays.asList(5,10,25,20,55,72,88,12,17,11));
            Exercise_03 testSwapper = new Exercise_03();
            Integer maximumFromList;
            maximumFromList = testSwapper.findLargestInListRange(comparableList, 1, 3);
        System.out.println("Maximum from list was: ");
        System.out.println(maximumFromList);
            testSwapper.swap(swappedArray, 0,3);
        System.out.println(swappedArray[0]);
        System.out.println(swappedArray[3]);
        testSwapper.swap(secondSwappedArray, 1, 4);
        System.out.println(secondSwappedArray[1]);
        System.out.println(secondSwappedArray[4]);
    }
    public <T> void swap(T [] inputArray, int firstPosition, int secondPosition){
            T temp;
            temp = inputArray[firstPosition];
            inputArray[firstPosition] = inputArray[secondPosition];
            inputArray[secondPosition] = temp;
    }

    public <T extends Comparable> T findLargestInListRange(ArrayList<T> list, int begin, int end){
        T maxElement = list.get(begin);
        for (int i = begin + 1; i< end+1; i++){
            if (list.get(i).compareTo(maxElement)>0){
                maxElement = list.get(i);
            }
        }
        return maxElement;
    }

}