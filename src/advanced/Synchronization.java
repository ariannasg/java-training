package advanced;

// using synchronized on the withdraw method means that only one thread can enter the method at a time, ensuring
// that we don't have threads interfering with the data.
public class Synchronization {
    public static void main(String[] args) {
        System.out.println("We try to withdraw money using 2 threads on a synchronised method");
        BankAccount account = new BankAccount(50);
        account.topUp(100);
        Thread t1 = new Thread(() -> {
            withdraw(account, 100);

        });
        Thread t2 = new Thread(() -> {
            withdraw(account, 100);
        });
        t1.start();
        t2.start();
    }

    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();

        if ((balance - amount) < -account.getOverdraft()) {
            System.out.println("Transaction denied!");
        } else {
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}

//CONSOLE OUTPUT:
//We try to withdraw money using 2 threads on a synchronised method
//$100 successfully withdrawn
//Current balance: 0
//Transaction denied!
//Current balance: 0
