package homeworks.hw14;

public class BankAccount {

    private String accountInfo;

    private double balance;

    //constructor with parameters
    public BankAccount(String accountInfo, double balance) {
        this.accountInfo = accountInfo;
        this.balance = balance;
    }

    /*//constructor without parameters
    public BankAccount() {
    }*/

    public String getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //add deposit to account
    public void deposit(double addDepositSum) {
        balance += addDepositSum;
    }

    //withdraw money from account
    public void withdraw(double withdrawSum) throws NegativeBalanceException, InsufficientFundsException {

        if (balance < 0) {
            throw new NegativeBalanceException();
        }

        if (balance < withdrawSum) {
            throw new InsufficientFundsException();
        }

        balance -= withdrawSum;
    }

    public void transferTo(BankAccount toAccount, double sum) {
        try {
            withdraw(sum);
        } catch (NegativeBalanceException e) {
            //throw new RuntimeException(e);
            System.err.println("Ошибка: Отрицательный баланс не допускается. transferTo");
        } catch (InsufficientFundsException e) {
            //throw new RuntimeException(e);
            System.err.println("Ошибка: Недостаточно средств на счете. transferTo");
        }
        toAccount.deposit(sum);
    }

}
