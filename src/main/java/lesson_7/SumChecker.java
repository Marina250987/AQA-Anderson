package lesson_7;

import java.util.Scanner;

public class SumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd number:");
        int b = scanner.nextInt();

        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}