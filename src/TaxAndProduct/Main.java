package TaxAndProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int empId;
        double salary;
        System.out.println("Enter employee info");
        System.out.println("Enter name");
        name = scanner.next();
        System.out.println("Enter emp id");
        empId = scanner.nextInt();
        System.out.println("Enter salary");
        salary = scanner.nextDouble();

        Employee emp = new Employee(empId, name, salary);
        emp.calcTax();

        int pid;
        double price, quantity;
        System.out.println("Enter product info");
        System.out.println("Enter product id");
        pid = scanner.nextInt();
        System.out.println("Enter price");
        price = scanner.nextDouble();
        System.out.println("Enter quantity");
        quantity = scanner.nextDouble();

        Product product = new Product(pid, price, quantity);
        product.calcTax();


    }
}
