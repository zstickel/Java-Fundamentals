package labs_examples.lambdas.labs;

import java.util.function.DoubleFunction;
import java.util.function.Function;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */
interface NoInOrOut {
    void noInOrOut();
}
interface  SameInOut<T>  {
     T sameInOut(T input);
}
interface TwoInOneOut<T,U,R>{
    R twoInOneOut(T first, U second);

}
class Exercise_01 {


    public static void main(String[] args) {
        NoInOrOut noInOrOutLambda = () -> System.out.println("Implemented the NoInOrOut interface with a lambda.");
        noInOrOutLambda.noInOrOut();
        NoInOrOut noInOrOutInnerClass = new NoInOrOut() {
            @Override
            public void noInOrOut() {
                System.out.println("Implemented the NoInOrOut interface with a anonymous inner class");
            }
        };
        noInOrOutInnerClass.noInOrOut();
        SameInOut sameInOutLambda = (x) -> x;
        System.out.println(sameInOutLambda.sameInOut(5.5));
        System.out.println(sameInOutLambda.sameInOut("String input"));
        SameInOut  sameInOutInnerClass = new  SameInOut() {
            @Override
            public Object sameInOut(Object input) {
                return input;
            }

        };
        System.out.println(sameInOutInnerClass.sameInOut(9));
        TwoInOneOut <Double, Double, Double> twoInOneOutLambda = (Double x,Double y) -> x + y;
        System.out.println(twoInOneOutLambda.twoInOneOut(5.7, 8.8));
        TwoInOneOut <Integer, Integer, Integer> twoInOneOutInnerClass = new TwoInOneOut<Integer, Integer, Integer>(){

            @Override
            public Integer twoInOneOut(Integer first, Integer second) {
                return first + second;
            }
        };
        System.out.println(twoInOneOutInnerClass.twoInOneOut(10, 5));
        DoubleFunction<Double> demonstrateUseOfBuiltIn = x -> x * x;
        System.out.println(demonstrateUseOfBuiltIn.apply(10.0));
        Function<String, String> demonstrateUseOfSecondBuiltIn = x -> {
            String add = x;
            for(int i= 0; i<4; i++) {
                x = x + add;
            }
            return x;
        };
        System.out.println(demonstrateUseOfSecondBuiltIn.apply("This will appear five times; "));
    }
}