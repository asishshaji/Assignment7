package Q3;

public class SavingAccount extends Account {
    String typeName;

    public SavingAccount(String accountNumber, String name, double balance, String branch, String typeName) {
        super(accountNumber, name, balance, branch);
        this.typeName = typeName;
    }


}
