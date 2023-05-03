package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */


class Exercise_04 {
    public static void main(String[] args) {
        ManipulatedObject manipulatedObject = new ManipulatedObject();
        SynchronizedRunnable firstRunnable = new SynchronizedRunnable(manipulatedObject, "First thread");
        SynchronizedRunnable secondRunnable = new SynchronizedRunnable(manipulatedObject, "Second thread");
        SynchronizedRunnable thirdRunnable = new SynchronizedRunnable(manipulatedObject, "Third thread");
        SynchronizedRunnable fourthRunnable = new SynchronizedRunnable(manipulatedObject, "Forth thread");
        try {
            firstRunnable.thread.join();
            secondRunnable.thread.join();
            thirdRunnable.thread.join();
            fourthRunnable.thread.join();
            System.out.println(manipulatedObject.getLastThreadsFirstInput());
            System.out.println(manipulatedObject.getLastThreadsSecondInput());
        }catch (InterruptedException e){
            System.out.println("Interrupted");
            firstRunnable.thread.interrupt();
            secondRunnable.thread.interrupt();
        }


    }
}