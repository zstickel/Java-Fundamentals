package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 {
    public static void main(String[] args) {
        System.out.println("Main method started.");
        ExampleNewThread threadOne = new ExampleNewThread("One");
        ExampleNewThread threadTwo = new ExampleNewThread("Two");
        ExampleNewThread threadThree = new ExampleNewThread("Three");
        ExampleNewThread threadFour = new ExampleNewThread("Four");
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        System.out.println("Main method complete.");
    }
}