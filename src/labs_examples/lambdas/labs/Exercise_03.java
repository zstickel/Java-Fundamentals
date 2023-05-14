package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */


interface DoesNothing{
    void doesNothing();
}

interface GetBlimp{
    Blimp get();
}
class Exercise_03 {
    public static void main(String[] args) {
        DoesNothing printSomething = Exercise_03::methodReferenceDemo;
        printSomething.doesNothing();
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        DoesNothing sayHelloFromInstance = instanceMethodReference::sayHelloFromInstance;
        sayHelloFromInstance.doesNothing();
        GetBlimp getABlimp = Blimp::new;
        System.out.println(getABlimp.get().getName());
    }
    public static void methodReferenceDemo(){
        System.out.println("Demonstrating method reference");
    }
}