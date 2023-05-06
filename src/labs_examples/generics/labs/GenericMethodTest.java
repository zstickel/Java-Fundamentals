package labs_examples.generics.labs;

public class GenericMethodTest{
    public static void main(String[] args) {
        printElement("This is a string ");
        printElement("next will be a double ");
        printElement(5.725);
        System.out.println("");
        System.out.println("Max is: ");
        System.out.println(getMax(11.12, 33.7, 9.9));

    }

    //Modify this method, make it generic
    public static <T> void printElement(T element ) {

        System.out.print(element);

    }
    public static <T extends Comparable> T getMax(T x, T y, T z) {
        T max = x;   // assume x is initially the largest

        if(y.compareTo(max) > 0) {
            max = y;   // y is the largest so far
        }

        if(z.compareTo(max) > 0 ) {
            max = z;   // z is the largest now
        }

        return max;   // returns the largest object
    }

}
