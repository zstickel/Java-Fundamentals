package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 {

    public static void main(String[] args) {
        try {
            customThrower();
        }catch(CustomException e){
            System.out.println(e.toString());
        }
    }
    public static void customThrower()throws CustomException {
        throw new CustomException();
    }
    public static class CustomException extends Exception {
        @Override
        public String toString(){
            return "Zane's custom exception was thrown";
        }
    }
}