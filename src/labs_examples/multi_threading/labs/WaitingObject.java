package labs_examples.multi_threading.labs;

public class WaitingObject {

    public synchronized void waitForIt(){

            try {
                System.out.println("Better wait");
                wait();
                System.out.println("Woken up. Proceeding");
            }catch (InterruptedException e){
                System.out.println("Interrupted");
                Thread.currentThread().interrupt();
            }
    }
    public synchronized  void proceedDude(){
            System.out.println("Waking them up");
            notifyAll();
    }

}
