package lesson_7;

import java.util.Scanner;

public class SumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number (x1): ");
        int x1 = scanner.nextInt();

        System.out.print("Enter 2nd number (x2): ");
        int x2 = scanner.nextInt();

        boolean result = within10and20(x1, x2);
        System.out.println("The sum is between 10 and 20: " + result);

        scanner.close();
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false; }

    }
}
