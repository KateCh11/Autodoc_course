package homeworks.hw18Bank;

public class BankMain {
    public static void main(String[] args) {
        //List of clients
        /*List<Client> clients = new ArrayList<Client>();
        clients.add(new Individual(200));
        clients.add(new Entity(50000));
        clients.add(new IndividualEntrepreneur(3000));*/

        final Client individual1 = new Individual(200);
        final Client entity1 = new Entity(50000);
        final Client individualEntrepreneur1 = new IndividualEntrepreneur(3000);

        //У физических лиц пополнение и снятие происходит без комиссии.
        individual1.printClientAccountInfo();
        System.out.println("Individual accountBalance before = " + individual1.getAccountBalance());
        individual1.addMoney(100);
        System.out.println("Individual accountBalance after add = " + individual1.getAccountBalance());
        try {
            individual1.withdrawMoney(100000);
        } catch (InsufficientFundsException2 e) {
            System.err.println("Ошибка: Недостаточно средств на счете.");
        } catch (NegativeBalanceException2 e) {
            System.err.println("Ошибка: Отрицательный баланс не допускается.");
        }
        //individual1.withdrawMoney(50);
        System.out.println("Individual accountBalance after withdraw = " + individual1.getAccountBalance() + "\n");

        //У юридических лиц — снятие с комиссией 1%.
        entity1.printClientAccountInfo();
        System.out.println("Entity accountBalance before = " + entity1.getAccountBalance());
        entity1.addMoney(1000);
        System.out.println("Entity accountBalance after add = " + entity1.getAccountBalance());
        try {
            entity1.withdrawMoney(100000);
        } catch (InsufficientFundsException2 e) {
            System.err.println("Ошибка: Недостаточно средств на счете.");
        } catch (NegativeBalanceException2 e) {
            System.err.println("Ошибка: Отрицательный баланс не допускается.");
        }
        //entity1.withdrawMoney(1000);
        System.out.println("Entity accountBalance after withdraw = " + entity1.getAccountBalance() + "\n");

        //У ИП — пополнение с комиссией 1%, если сумма меньше 1000, если больше 0.5
        individualEntrepreneur1.printClientAccountInfo();
        System.out.println("IndividualEntrepreneur accountBalance before = " + individualEntrepreneur1.getAccountBalance());
        individualEntrepreneur1.addMoney(100);
        System.out.println("IndividualEntrepreneur accountBalance after add = " + individualEntrepreneur1.getAccountBalance());
        try {
            individualEntrepreneur1.withdrawMoney(100);
        } catch (InsufficientFundsException2 e) {
            System.err.println("Ошибка: Недостаточно средств на счете.");
        } catch (NegativeBalanceException2 e) {
            System.err.println("Ошибка: Отрицательный баланс не допускается.");
        }
        //individualEntrepreneur1.withdrawMoney(1000);
        System.out.println("IndividualEntrepreneur accountBalance after withdraw = " + individualEntrepreneur1.getAccountBalance()  + "\n");
    }
}
