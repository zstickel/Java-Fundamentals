package labs_examples.multi_threading.labs;

public class SynchronizedRunnable implements Runnable{
    ManipulatedObject manipulatedObject;
    Thread thread;
    String name;
    SynchronizedRunnable(ManipulatedObject manipulatedObject, String name){
        this.manipulatedObject = manipulatedObject;
        this.name = name;
        thread = new Thread(this, name);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("Thread " + name + " started");
        synchronized (manipulatedObject){
            System.out.println("Thread " + name + " starting synchronized");
            manipulatedObject.setLastThreadsFirstInput(name + " set manipulated object's first input");
            manipulatedObject.setLastThreadsSecondInput(name + " set manipulated object's second input.");
            System.out.println("Thread " + name + " ending synchronized");
        }
        System.out.println("Thread " + name + " ending");
    }
}
