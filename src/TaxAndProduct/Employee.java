package TaxAndProduct;

public class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double tax = salary * incomeTax;
        System.out.println("Tax : " + tax);
    }
}
