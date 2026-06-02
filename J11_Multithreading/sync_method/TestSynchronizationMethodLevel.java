package J11_Multithreading.sync_method;

import J11_Multithreading.common.WithdrawTask;
import J11_Multithreading.common.Account;

/*
 * Method-Level Synchronization
 *
 * The synchronized keyword locks the entire method.
 * Only one thread can execute this method at a time
 * for the same object instance.
 *
 * This prevents race conditions and ensures
 * thread-safe access to shared resources.
 */

class BankAccountSyncMethod implements Account {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance!");
        }
    }
}

public class TestSynchronizationMethodLevel {

    public static void main(String[] args) {

        Account account = new BankAccountSyncMethod();

        WithdrawTask task = new WithdrawTask(account);

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");

        t1.start();
        t2.start();
    }
}