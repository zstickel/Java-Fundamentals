package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try{
            throwingExample();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void throwingExample()throws Exception {
        throw new Exception("This new exception");
    }

}