package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    public static void main(String[] args) {
        methodOverloading("One string");
        methodOverloading("First string ", "Second string");
        ClassForPassByReference example = new ClassForPassByReference();
        example.refVariable = "First String";
        System.out.println(example.refVariable);
        passByReferenceMethod(example);
        System.out.println(example.refVariable);
        System.out.println(largest(800,15,75,100));
    }
    public static void methodOverloading(String oneString){
        System.out.println(oneString);
    }
    public static void methodOverloading(String first, String second){
        System.out.println(first + second);
    }
    public static void passByReferenceMethod(ClassForPassByReference example){
        example.refVariable = "New String";
    }
    public static int largest(int first, int second, int third, int fourth){
        int largest = first;
        if (largest < second) {
            largest = second;
        }
        if (largest < third){
            largest = third;
        }
        if (largest < fourth){
            largest = fourth;
        }
        return largest;
    }
}

class ClassForPassByReference {
    String refVariable;
}