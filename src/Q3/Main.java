package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountNumber;
        String name;
        double balance;
        String branch;
        int choice;
        Account account = null;

        System.out.println("Enter account number");
        accountNumber = scanner.next();
        System.out.println("Enter name");
        name = scanner.next();
        System.out.println("Enter balance");
        balance = scanner.nextDouble();
        System.out.println("Enter branch");
        branch = scanner.next();

        System.out.println("Enter choice (1-Saving,2-Current)");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (balance > 5000) {
                    account = new SavingAccount(accountNumber, name, balance, branch, "savings");
                } else System.out.println("Not enough balance");
                break;
            case 2:
                if (balance > 1000) {
                    account = new CurrentAccount(accountNumber, name, balance, branch, "current");
                } else System.out.println("Not enough balance");
                break;
            default:
                System.out.println("Enter valid choice");
        }
        System.out.println("Enter choice(1:Withdraw,2:Deposit)");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                double amountToWithdraw;
                System.out.println("Enter amount to withdraw");
                amountToWithdraw = scanner.nextDouble();
                if (account != null) {
                    if (account instanceof SavingAccount && account.getBalance() > 5000) {
                        account.withdraw(amountToWithdraw);
                    } else {
                        System.out.println("Not enough balance");
                    }
                    if (account instanceof CurrentAccount && account.getBalance() > 1000) {
                        account.withdraw(amountToWithdraw);
                    } else {
                        System.out.println("Not enough balance");
                    }
                    System.out.println("Available balance after transaction " + account.getBalance());
                }
                break;
            case 2:
                double amountToDeposit;
                System.out.println("Enter amount to deposit");
                amountToDeposit = scanner.nextDouble();
                if (account != null) {
                    account.deposit(amountToDeposit);
                    System.out.println("Available balance after transaction " + account.getBalance());
                }
                break;
            default:
                System.out.println("Enter valid choice");
        }

        System.out.println("Total amount in bank " + Account.totalBankMoney);

    }
}
