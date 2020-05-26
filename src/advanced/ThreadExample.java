package advanced;

// one way to use threads is to extend from the Thread class and override the run method
public class ThreadExample extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println(this.getName() + " - executing for loop: " + i);
            i++;
        }
    }
}
