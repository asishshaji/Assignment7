package Q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int id, age;
        String name;

        System.out.println("Enter voter id");
        id = scanner.nextInt();
        System.out.println("Enter age");
        age = scanner.nextInt();
        System.out.println("Enter name");
        name = scanner.next();

        Voter voter = new Voter(id, name, age);
        System.out.println(voter);
    }
}
