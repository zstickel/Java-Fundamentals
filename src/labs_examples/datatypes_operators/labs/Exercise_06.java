package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        // write code here
        double radius = 3.14;
        double height = 5;
        double surfaceArea = surfaceArea(radius, height);
        double volume = volume(radius, height);
        System.out.println("Surface area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }
    static public double surfaceArea(double radius, double height){
        double surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius);
        return surfaceArea;
    }
    static public double volume(double radius, double height){
        double volume = Math.PI * (radius * radius) * height;
        return volume;
    }
}