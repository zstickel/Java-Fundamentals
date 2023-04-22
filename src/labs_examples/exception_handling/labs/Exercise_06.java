package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
       catchingException();
    }

    public static void catchingException(){
        try{
            throwingExample();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void throwingExample()throws Exception {
        throw new Exception("This new exception was thrown");
    }
}