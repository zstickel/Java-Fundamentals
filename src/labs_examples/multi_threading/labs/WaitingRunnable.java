package labs_examples.multi_threading.labs;

public class WaitingRunnable implements Runnable {
    Thread thread;
    WaitingObject waitingObject;
    boolean shouldWait;
    WaitingRunnable(String name, WaitingObject waitingObject, boolean shouldWait){
        this.shouldWait = shouldWait;
        thread = new Thread(this, name);
        this.waitingObject = waitingObject;
    }

    @Override
    public void run() {
        if (shouldWait) {
            waitingObject.waitForIt();
        }else{
            waitingObject.proceedDude();
        }

    }
}
