package Q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidFeeException {
        Scanner scanner = new Scanner(System.in);
        String name;
        double fees;

        System.out.println("Enter name");
        name = scanner.next();

        Student student = new Student(name);

        System.out.println("Enter fees");
        fees = scanner.nextDouble();

        student.getFee(fees);
        System.out.println(student);
    }
}
