package Q1;

public class Product implements Taxable {
    int pid;
    double price, quantity;

    public Product(int pid, double price, double quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double tax = price * incomeTax;
        System.out.println("Tax : " + tax);
    }
}
