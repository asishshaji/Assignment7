package Q2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int noOfEmployees;
        String name;
        int empId;
        double salary;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of employees");
        noOfEmployees = scanner.nextInt();
        Employee[] employees = new Employee[noOfEmployees];

        for (int i = 0; i < noOfEmployees; i++) {
            System.out.println("Enter employee info");

            System.out.println("Enter name");
            name = scanner.next();

            System.out.println("Enter emp id");
            empId = scanner.nextInt();


            Employee employee = new Employee(empId, name, 0.0);
            boolean flag = false;

            for (Employee emp : employees
            ) {
                if (emp != null)
                    if (emp.equals(employee)) {
                        flag = true;
                        break;
                    }
            }


            if (flag) {
                System.out.println("Id already exists");
                i = i - 1;
            } else {
                System.out.println("Enter salary");
                salary = scanner.nextDouble();
                employee.setSalary(salary);
                employees[i] = employee;
            }


        }

        for (Employee emp :
                employees
        ) {
            System.out.println(emp.toString());
        }

    }
}
