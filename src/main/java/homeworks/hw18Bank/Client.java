package homeworks.hw18Bank;

public abstract class Client {

    double moneySum;

    public double getMoneySum() {
        return moneySum;
    }
    
    public Client(double moneySum) {
        this.moneySum = moneySum;
    }

    public abstract void printClientAccountInfo();

    public abstract void addMoney(double sumToAdd);

    public void withdrawMoney(double sumToWithdraw) throws NegativeBalanceException2, InsufficientFundsException2 {
        validate(sumToWithdraw);
        withdrawMoneyInternal(sumToWithdraw);
    }

    abstract void withdrawMoneyInternal(double sumToWithdraw);


    public abstract double getAccountBalance();

    private void validate(double sumToWithdraw) throws NegativeBalanceException2, InsufficientFundsException2 {
        if (sumToWithdraw < 0) {
            throw new NegativeBalanceException2();
        }

        if (moneySum < sumToWithdraw) {
            throw new InsufficientFundsException2();
        }
    }
}
