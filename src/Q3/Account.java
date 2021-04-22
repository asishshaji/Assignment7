package Q3;

public class Account {
    public static double totalBankMoney = 0.0;
    String accountNumber;
    String name;
    double balance;
    String branch;
    public Account(String accountNumber, String name, double balance, String branch) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.branch = branch;
        totalBankMoney += balance;
    }

    public static double getTotalBankMoney() {
        return totalBankMoney;
    }

    public double getBalance() {
        return balance;
    }

    public String getBranch() {
        return branch;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }

}
