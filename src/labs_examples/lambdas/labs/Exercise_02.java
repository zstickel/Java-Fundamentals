package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_02 {
    public static void main(String[] args) {
        Function<Integer,Integer> addToSelf = x -> x +x;
        System.out.println(addToSelf.apply(10));
        DoubleFunction<Double> doubleSelf = x -> 2*x;
        System.out.println(doubleSelf.apply(2.3));
        BooleanSupplier getABool = () -> true;
        System.out.println(getABool.getAsBoolean());
        Consumer<String> consumeTheInput = x -> System.out.println("Consuming the input: " + x);
        consumeTheInput.accept("Being consumed!");
        Predicate<Integer> greaterThanTen = x -> x > 10;
        Integer testNumber = 33;
        System.out.println("Is " + testNumber + " greater than ten? ");
        System.out.println(greaterThanTen.test(testNumber));
        testNumber = 5;
        System.out.println("Is " + testNumber + " greater than ten? ");
        System.out.println(greaterThanTen.test(testNumber));
        Double pi = 3.14314;
        ToIntFunction<Double> toInteger = x -> x.intValue();
        System.out.println(pi + " as an integer is: ");
        System.out.println(toInteger.applyAsInt(pi));


    }
}