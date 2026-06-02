/*
Race Condition Explanation:

A race condition occurs when multiple threads access and modify shared data simultaneously.
In this example, both threads check the condition (balance >= amount) at the same time
when balance is still 1000. As a result, both threads proceed with withdrawal.

Execution flow:
- Thread 1 checks → true
- Thread 2 checks → true
- Thread 1 withdraws → balance becomes 200
- Thread 2 also withdraws → balance becomes -600 (incorrect state)

The "Insufficient balance" message is not printed because the second thread never
checks the updated balance after the first withdrawal.

Solution using Synchronization:
By marking the withdraw() method as synchronized, we ensure that only one thread
can execute it at a time. This prevents concurrent modification and maintains
data consistency.
*/

package J11_Multithreading.race_condition;

import J11_Multithreading.common.WithdrawTask;
import J11_Multithreading.common.Account;

class BankAccountRace implements Account {
    private int balance = 1000;

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance!");
        }
    }
}

public class TestRaceCondition {
    public static void main(String[] args) {

        Account account = new BankAccountRace();

        WithdrawTask task = new WithdrawTask(account);

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");

        t1.start();
        t2.start();
    }
}
