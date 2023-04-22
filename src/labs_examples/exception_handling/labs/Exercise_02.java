package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


public class Exercise_02 {
    public static void main(String[] args) {
        try {
           // int i = 5/0;
            String[] exceptionArray = {"one","two"};
            String third = exceptionArray[2];
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

}