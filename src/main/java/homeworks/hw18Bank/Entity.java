package homeworks.hw18Bank;

public class Entity extends Client {
    public Entity(double moneySum) {
        super(moneySum);
    }

    @Override
    public void printClientAccountInfo() {
        System.out.println("У юридических лиц — снятие с комиссией 1%.");
    }

    @Override
    public void addMoney(double sumToAdd) {
        moneySum = moneySum + sumToAdd;
    }

    @Override
    public void withdrawMoneyInternal(double sumToWithdraw) {
        double commission = 1;//комиссия 1% - беру от суммы снятия sumToWithdraw
        double sumOfCommission = (sumToWithdraw * commission) / 100;//посчитали сумму комиссии
        moneySum = moneySum - sumToWithdraw - sumOfCommission;
    }

    @Override
    public double getAccountBalance() {
        return getMoneySum();
    }
}
