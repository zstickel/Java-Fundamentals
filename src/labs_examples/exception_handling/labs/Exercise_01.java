package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        try {
            int i = 5/0;
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}