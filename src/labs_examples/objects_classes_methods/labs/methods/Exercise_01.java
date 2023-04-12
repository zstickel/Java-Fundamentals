package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        multiply(5,4);
        divide(20,5);
        joke();
        secondsInYears(5);
        varargs("What", "Is", "Happening");
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Why did the chicken cross the road?");
        System.out.println("To get to the other side.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long secondsInYears(int years){
        long longYears = years;
        return longYears * 31536000;

    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(String ... args){
        return args.length;
    }





}
