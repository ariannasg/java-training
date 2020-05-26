package advanced;

// a deadlock occurs when 2 or more threads get blocked forever. this can happen when threads are waiting for
// resources held by each other.
// in general, is good to avoid nested synchronised blocks like the ones below, to avoid creating monitor
// objects that can potentially end up generating a deadlock situation
public class Deadlock {
    public static final Object spoon = new Object();
    public static final Object bowl = new Object();

    public static void main(String[] args) {

        Thread cook1 = new Thread(() -> {
            // here we have a synchronized block inside a non-synchronized method.
            // the object in brackets (spoon) is known as a "monitor object" and it means that if a thread is inside
            // the synchronised block, no other thread can access that object.
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl...");

                synchronized (bowl) { // here bowl is a monitor object
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook2: Holding the bowl...");
                System.out.println("Cook2: Waiting for the spoon...");

                synchronized (bowl) {
                    System.out.println("Cook2: Holding the spoon and the bowl.");
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
