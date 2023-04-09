package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();
        for (int i = 0; i < 10; i ++){
            nums.add(Math.random() * (100) + 1);
        }
        if (nums.isEmpty()){
            System.out.println("Array is empty");
        }else{
            System.out.println("Array isn't empty");
        }
        System.out.println("Array has this many elements: " + nums.size());
        for (Double num : nums){
            System.out.println(num);
        }

    }
}
