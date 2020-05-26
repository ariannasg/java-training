package advanced;

// threads allow multiple actions to be performed at the same time inside a single process.
// cooking analogy:
// "cooking a meal" is the process, "a burner" is the core in the CPU. when having a stove with multiple burners, we
// can cook multiple ingredients at once. similarly, when having a machine with multiple cores, we can run multiple
// tasks at the same time.
// a single process can have multiple threads working at the same time.
// like a process, a thread is an independent part of the execution that runs in isolation/
// each thread has its own stack, and its own local variables, so when a method is running on a thread, the method and
// local variables are only available in that thread.
// why not using multiple processes instead of multiple threads? -> threads are more closely connected to each other,
// they share memory with other threads.
// every time we run a program in java we create at least one thread
public class Multithreading {
    public static void main(String[] args) {
        System.out.println("When running this class, we can see that we start a thread automatically");
        System.out.println("Number of threads: " + Thread.activeCount());
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("We have 2 threads because the garbage collector also starts a thread");
        System.out.println("If we run this on debug mode, the output of activeCount will be 1");

        System.out.println("Now we create another 2 threads using the ThreadExample class");
        ThreadExample thread1 = new ThreadExample(); // thread awaiting to start
        thread1.setName("ThreadExample1"); // otherwise it will put a name automatically. i:e: Thread 0
        System.out.printf("ThreadExample1 is %s \n", thread1.isAlive() ? "alive" : "dead");
        thread1.start(); // thread set to be "alive"
        System.out.println("Number of threads: " + Thread.activeCount());
        System.out.printf("ThreadExample1 is %s \n", thread1.isAlive() ? "alive" : "dead");

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("ThreadExample2");
        System.out.printf("ThreadExample2 is %s \n", thread2.isAlive() ? "alive" : "dead");
        thread2.start();
        System.out.println("Number of threads: " + Thread.activeCount());
        System.out.printf("ThreadExample2 is %s \n", thread2.isAlive() ? "alive" : "dead");

        System.out.println("Now we create another thread using the RunnableExample class");
        Thread thread3 = new Thread(new RunnableExample());
        thread3.setName("RunnableExample1");
        System.out.printf("RunnableExample1 is %s \n", thread3.isAlive() ? "alive" : "dead");
        thread3.start();
        System.out.println("Number of threads: " + Thread.activeCount());
        System.out.printf("RunnableExample1 is %s \n", thread3.isAlive() ? "alive" : "dead");

        System.out.println("Now we create another thread implementing Runnable directly, using a lambda");
        Thread thread4 = new Thread(() -> {
            int i = 1;
            while (i <= 10) {
                System.out.println(Thread.currentThread().getName() + " - executing for loop: " + i);
                i++;
            }
        });
        thread4.setName("LambdaRunnable1");
        System.out.printf("LambdaRunnable1 is %s \n", thread4.isAlive() ? "alive" : "dead");
        thread4.start();
        System.out.println("Number of threads: " + Thread.activeCount());
        System.out.printf("LambdaRunnable1 is %s \n", thread4.isAlive() ? "alive" : "dead");
    }
}

// ATTENTION: THE OUTPUT OF THE LOOPS WILL VARY IN EACH RUN!
//CONSOLE OUTPUT:
//When running this class, we can see that we start a thread automatically
//Number of threads: 2
//Thread name: main
//We have 2 threads because the garbage collector also starts a thread
//If we run this on debug mode, the output of activeCount will be 1
//Now we create another 2 threads using the ThreadExample class
//ThreadExample1 is dead
//Number of threads: 3
//ThreadExample1 is alive
//ThreadExample2 is dead
//Number of threads: 4
//ThreadExample2 is alive
//Now we create another thread using the RunnableExample class
//RunnableExample1 is dead
//Number of threads: 5
//RunnableExample1 is alive
//Now we create another thread implementing Runnable directly, using a lambda
//LambdaRunnable1 is dead
//Number of threads: 6
//LambdaRunnable1 is alive
//LambdaRunnable1 - executing for loop: 1
//LambdaRunnable1 - executing for loop: 2
//LambdaRunnable1 - executing for loop: 3
//LambdaRunnable1 - executing for loop: 4
//RunnableExample1 - executing for loop: 1
//ThreadExample1 - executing for loop: 1
//RunnableExample1 - executing for loop: 2
//LambdaRunnable1 - executing for loop: 5
//ThreadExample2 - executing for loop: 1
//LambdaRunnable1 - executing for loop: 6
//RunnableExample1 - executing for loop: 3
//ThreadExample1 - executing for loop: 2
//RunnableExample1 - executing for loop: 4
//LambdaRunnable1 - executing for loop: 7
//LambdaRunnable1 - executing for loop: 8
//ThreadExample2 - executing for loop: 2
//LambdaRunnable1 - executing for loop: 9
//RunnableExample1 - executing for loop: 5
//ThreadExample1 - executing for loop: 3
//RunnableExample1 - executing for loop: 6
//LambdaRunnable1 - executing for loop: 10
//ThreadExample2 - executing for loop: 3
//ThreadExample2 - executing for loop: 4
//ThreadExample2 - executing for loop: 5
//RunnableExample1 - executing for loop: 7
//ThreadExample1 - executing for loop: 4
//RunnableExample1 - executing for loop: 8
//ThreadExample2 - executing for loop: 6
//RunnableExample1 - executing for loop: 9
//ThreadExample1 - executing for loop: 5
//ThreadExample1 - executing for loop: 6
//RunnableExample1 - executing for loop: 10
//ThreadExample2 - executing for loop: 7
//ThreadExample2 - executing for loop: 8
//ThreadExample1 - executing for loop: 7
//ThreadExample2 - executing for loop: 9
//ThreadExample2 - executing for loop: 10
//ThreadExample1 - executing for loop: 8
//ThreadExample1 - executing for loop: 9
//ThreadExample1 - executing for loop: 10
