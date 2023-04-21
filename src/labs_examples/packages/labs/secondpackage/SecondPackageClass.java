package labs_examples.packages.labs.secondpackage;

import labs_examples.packages.labs.firstpackage.FirstPackageClass;

public class SecondPackageClass {
    public static void main(String[] args) {
        FirstPackageClass.publicMethodExample();
   //Is an error because it is protected: FirstPackageClass.protectedMethodExample();
        secondPackageProtected();
    }
    public void secondPackagePublicMethod(){
        System.out.println("Second packages public method");
    }
    protected static void secondPackageProtected(){
        System.out.println("Second packages protected method, only accessible in second pacakge");
    }
}
