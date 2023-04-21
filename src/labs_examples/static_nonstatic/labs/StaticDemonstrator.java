package labs_examples.static_nonstatic.labs;

public class StaticDemonstrator {

    public static void main(String[] args) {
        firstStaticMethod();
        StaticDemonstrator staticDemonstrator = new StaticDemonstrator();
        staticDemonstrator.nonStaticMethod();
    }
    public void nonStaticMethod(){
        System.out.println("Non static method called");
        secondNonStaticMethod();
        StaticDemonstratorHelper staticDemonstratorHelper = new StaticDemonstratorHelper();
        staticDemonstratorHelper.otherClassNonStatic();
        otherStaticMethod();
        StaticDemonstratorHelper.otherClassStatic();
    }

    public void otherStaticMethod(){
        System.out.println("Other static method");
    }

    public void secondNonStaticMethod(){
        System.out.println("Second non static method called");
    }
    public static void firstStaticMethod(){
        System.out.println("First static method called");
        secondStaticMethod();
        StaticDemonstrator staticDemonstrator = new StaticDemonstrator();
        staticDemonstrator.nonStaticMethod();
        StaticDemonstratorHelper.otherClassStatic();
    }
    public static void secondStaticMethod(){
        System.out.println("Second static method called");
    }

}

