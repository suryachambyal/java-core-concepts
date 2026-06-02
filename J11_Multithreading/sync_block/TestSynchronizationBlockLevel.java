package J11_Multithreading.sync_block;

import J11_Multithreading.common.WithdrawTask;
import J11_Multithreading.common.Account;

/*
 * Block-Level Synchronization
 *
 * synchronized(this) locks only the critical section
 * instead of the entire method.
 *
 * Advantage:
 * Better performance because only the code that
 * accesses shared resources is synchronized.
 */

class BankAccountSyncBlock implements Account {
    private int balance = 1000;

    public void withdraw(int amount) {

        synchronized (this) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing...");
                balance -= amount;
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " - Insufficient balance!");
            }
        }

        System.out.println("Transaction attempt finished.");
    }
}

public class TestSynchronizationBlockLevel {

    public static void main(String[] args) {

        Account account = new BankAccountSyncBlock();

        WithdrawTask task = new WithdrawTask(account);

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");

        t1.start();
        t2.start();
    }
}