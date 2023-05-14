package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demonstrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example_04 {
    public static void main(String[] args) throws IOException {
        System.out.println("Example 4 - streams");
        IntStream.range(1, 16).forEach(System.out::println);
        List<Integer> integers = Arrays.asList(5, 10, 15, 20);
        Integer sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the list: " + sum);
        Integer sumLess15 = integers.stream().filter(x -> x < 15).reduce(0, (x, y) -> x + y);
        System.out.println("Sum of the numbers less than 15: " + sumLess15);
        Integer sumWhenAddingFiveToEach = integers.stream().map(x -> x + 5).reduce(0, (x, y) -> x + y);
        System.out.println("Sum of the numbers after adding 5 to each: " + sumWhenAddingFiveToEach);
        Stream<String> inputFileStream = Files.lines(Paths.get("/Users/zanestickel/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv"));
        inputFileStream.map(x -> x.split(",")).forEach(x -> System.out.println(x[1]));
        inputFileStream.close();
        Stream<String> inputFileStreamTwo = Files.lines(Paths.get("/Users/zanestickel/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv"));
        Double sumOfNumsInFile = inputFileStreamTwo.map(x -> x.split(",")).map(x -> Double.parseDouble(x[2])).reduce(0.0, (x,y)-> x + y);
        System.out.println("Sum of numbers in csv third element: " + sumOfNumsInFile);
        inputFileStreamTwo.close();
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);


        boolean answer = list.stream().anyMatch(x -> x == 4 || x ==6);
        System.out.println("Is there a 4 or 6 in the list? " + answer);
        boolean answerTwo = list.stream().allMatch(x -> x == 4);
        System.out.println("Are they all 4? " + answerTwo);
        System.out.println("Original list: ");
        for(Integer element: list){
            System.out.println(element);
        }
        List<Integer> transformedByDoublingListValues = list.stream().map(x -> 2 * x).collect(Collectors.toList());
        System.out.println("After Transformation: ");
        for (Integer element: transformedByDoublingListValues){

            System.out.println(element);
        }
    }
}
