package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class InheritanceTest
{

        public static void main(String[] args)
        {
            Parent c = new Child();
            c.doSomething();
        }
}


    class Parent
    {
        public Parent()
        {
            System.err.println("Parent called");
        }
        public void doSomething()
        {
            System.err.println("Parent do something called");
        }
    }

    class Child extends Parent
    {
        public Child()
        {
            System.err.println("Child called");
        }
        public void doSomething()
        {
            System.err.println("Child do something called");
        }
    }

