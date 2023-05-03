package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05{
    public static void main(String[] args) {
        WaitingObject waitingObject = new WaitingObject();
        WaitingRunnable firstWaitingRunnable = new WaitingRunnable("First", waitingObject, true);
        WaitingRunnable secondnonWaitingRunnable = new WaitingRunnable("Second", waitingObject, false);

        firstWaitingRunnable.thread.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Fail");
        }
        secondnonWaitingRunnable.thread.start();
    }
}