package homeworks.hw18Bank;

public class Individual extends Client {
    public Individual(double moneySum) {
        super(moneySum);
    }

    @Override
    public void printClientAccountInfo() {
        System.out.println("У физических лиц пополнение и снятие происходит без комиссии.");
    }

    @Override
    public void addMoney(double sumToAdd) {
        moneySum = moneySum + sumToAdd;
    }

    @Override
    public void withdrawMoneyInternal(double sumToWithdraw) {
        moneySum = moneySum - sumToWithdraw;
    }

    @Override
    public double getAccountBalance() {
        return getMoneySum();
    }
}
