package J11_Multithreading.common;

public class WithdrawTask implements Runnable {

    private final Account account;   

    public WithdrawTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(800);
    }
}