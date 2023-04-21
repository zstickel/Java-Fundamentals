package labs_examples.packages.labs.firstpackage;

import labs_examples.packages.labs.secondpackage.SecondPackageClass;

public class FirstPackageClass {

    public static void publicMethodExample(){
        System.out.println("First package public example");
        SecondPackageClass secondPackageClass = new SecondPackageClass();
        secondPackageClass.secondPackagePublicMethod();
    }
    protected  static void protectedMethodExample(){
        System.out.println("Protected method, only works in this package or with a child");
    }
}
