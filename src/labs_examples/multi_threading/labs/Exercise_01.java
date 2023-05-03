package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


class ExampleRunnableController {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        for (int i= 1; i< 21; i++){
            String name = "Thread " + Integer.toString(i);
            ExampleRunnable newThread = new ExampleRunnable(name);
            if (i==5 || i== 20) {
                newThread.thread.setPriority(10);
            }else{
                newThread.thread.setPriority(1);
            }
        }

        System.out.println("Main thread complete");
    }
}

