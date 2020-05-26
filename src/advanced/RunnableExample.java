package advanced;

// one way to use threads is to implement the Runnable interface and override the run method.
// one of the benefits to implement Runnable instead of extending from Thread,
// is that we could extend from another class (in java we have single inheritance!)
public class RunnableExample implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + " - executing for loop: " + i);
            i++;
        }
    }
}
