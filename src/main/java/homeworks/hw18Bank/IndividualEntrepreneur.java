package homeworks.hw18Bank;

public class IndividualEntrepreneur extends Client {
    public IndividualEntrepreneur(double moneySum) {
        super(moneySum);
    }

    @Override
    public void printClientAccountInfo() {
        System.out.println("У ИП — пополнение с комиссией 1%, если сумма меньше 1000, если больше 0.5");
    }

    @Override
    public void addMoney(double sumToAdd) {
        if (sumToAdd < 1000) {
            double commission = 1; //пополнение с комиссией 1%, если сумма меньше 1000
            double sumOfcomission = (sumToAdd * commission) / 100;//посчитали сумму комиссии
            moneySum = moneySum + sumToAdd + sumOfcomission;
        } else {
            double commission = 0.5; //пополнение с комиссией 0.5%, если сумма ,больше или = 1000
            double sumOfCommission = (sumToAdd * commission) / 100;//посчитали сумму комиссии
            moneySum = moneySum + sumToAdd + sumOfCommission;
        }
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
