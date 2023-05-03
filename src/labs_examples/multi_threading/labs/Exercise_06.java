package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Exercise_06 {
    public static void main(String[] args) {
        IntegerWrapper counter = new IntegerWrapper();
        CountSequentiallyRunnable counterThreadOne = new CountSequentiallyRunnable(counter, "One");
        try {
            Thread.sleep(5);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
            Thread.currentThread().interrupt();
        }
        CountSequentiallyRunnable counterThreadTwo = new CountSequentiallyRunnable(counter, "Two");
        try {
            Thread.sleep(5);
        }catch (InterruptedException e){
            System.out.println("Interrputed");
            Thread.currentThread().interrupt();
        }
        CountSequentiallyRunnable counterThreadThree = new CountSequentiallyRunnable(counter, "Three");
    }
}