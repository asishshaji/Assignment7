package Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> weekdays = new ArrayList<>(
                Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
        int position;
        System.out.println("Enter position ");
        position = scanner.nextInt();

        try {
            System.out.println(weekdays.get(position));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out. Enter values between 0-6");
        }
    }
}
