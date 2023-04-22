package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        try {
            int i = 5/0;
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Always do this no matter what");
        }
    }
}