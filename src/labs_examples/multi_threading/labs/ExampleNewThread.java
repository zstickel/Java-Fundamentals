package labs_examples.multi_threading.labs;

public class ExampleNewThread extends Thread{
    String name;
    ExampleNewThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        super.run();
        try {
            for(int i= 1; i< 51; i++){
                Thread.sleep(100);
                System.out.println("Thread " + name +  " pass number: " + i);
            }
            System.out.println("Thread " + name + " is complete.");
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted");
            System.out.println(e.toString());
        }
    }
}
