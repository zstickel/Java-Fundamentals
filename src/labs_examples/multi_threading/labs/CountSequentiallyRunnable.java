package labs_examples.multi_threading.labs;

public class CountSequentiallyRunnable implements Runnable{
    IntegerWrapper counter;
    Thread thread;

    String name;
     CountSequentiallyRunnable(IntegerWrapper counter, String name){
        thread = new Thread(this, name);
        this.counter = counter;
        this.name = name;
        thread.start();
    }
    @Override
    public void run() {
        while(counter.count < 101) {
            synchronized (counter) {
                if (counter.count < 101) {
                    System.out.println("Thread " + name + " prints " + counter.count);
                }
                counter.count ++;
            }
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println("Interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }
}
