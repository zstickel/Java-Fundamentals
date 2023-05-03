package labs_examples.multi_threading.labs;

public class ExampleRunnable implements Runnable {
    Thread thread;
    int count = 0;
    String name;

    ExampleRunnable(String name){
        thread = new Thread(this, name);
        this.name = name;
        thread.start();
    }
    @Override
    public void run() {
        try {
            System.out.println(name + " started.");
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                if (Math.random() > 0.5) {
                    count++;
                }
            }
            System.out.println("Final count for " + name + " is " + count);
            System.out.println(name + " finished.");

        }catch(InterruptedException e){
            System.out.println(name + " interrupted.");
            System.out.println(e.toString());
            Thread.currentThread().interrupt();
        }

    }
}
