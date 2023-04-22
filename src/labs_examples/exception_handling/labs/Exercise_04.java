package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        try {
            try{
                String[] exceptionArray = {"one","two"};
                String third = exceptionArray[2];
            }catch(Exception e){
                System.out.println(e.toString());
            }
            int i = 5/0;

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}