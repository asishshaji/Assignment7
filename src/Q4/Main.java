package Q4;

import java.util.Scanner;

//67, 89, 23, 67, 12, 55, 66
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] split = data.split(",");

        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s.strip());
        }
        System.out.println("Sum is " + sum);
    }
}
