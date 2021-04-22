package Q3;

public class CurrentAccount extends Account {
    String typeName;

    public CurrentAccount(String accountNumber, String name, double balance, String branch, String typeName) {
        super(accountNumber, name, balance, branch);
        this.typeName = typeName;
    }

    @Override
    void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    void withdraw(double amount) {
        this.balance -= amount;
    }
}
