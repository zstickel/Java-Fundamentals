package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 * <p>
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 */
public class Exercise_03 {

    public static void main(String[] args) {
//        int x = factorial(5);
//        System.out.println(x);
//        should print 120
        double x = factorial(5);
        System.out.println(x);
    }

    public static double factorial(double num) {
        if (num == 1) {
            return 1.0;
        } else {
            return num * factorial(num - 1);
        }
    }


}

