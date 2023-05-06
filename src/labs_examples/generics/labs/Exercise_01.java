package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise_01 <T, U> {
    private T genericObject;
    private U secondGenericObject;
    Exercise_01(T genericObject, U secondGenericObject){
        this.genericObject = genericObject;
        this.secondGenericObject = secondGenericObject;
    }

    public U getSecondGenericObject() {
        return secondGenericObject;
    }

    public void setSecondGenericObject(U secondGenericObject) {
        this.secondGenericObject = secondGenericObject;
    }

    public void setGenericObject(T genericObject) {
        this.genericObject = genericObject;
    }

    public T getGenericObject() {
        return genericObject;
    }

    public static void main(String[] args) {
        Exercise_01 exercise01 = new Exercise_01("First One", 5.55);
        System.out.println(exercise01.getGenericObject());
        System.out.println(exercise01.getSecondGenericObject());
        Exercise_01 exercise2 = new Exercise_01(33.22, "Totally generic");
        System.out.println(exercise2.getGenericObject());
        System.out.println(exercise2.getSecondGenericObject());
    }
}