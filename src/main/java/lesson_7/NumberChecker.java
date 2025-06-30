package lesson_7;

public class NumberChecker {

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is a negative number.");
        }
    }

    public static void main(String[] args) {
        NumberChecker.checkNumber(5);
        NumberChecker.checkNumber(-1);
        NumberChecker.checkNumber(0);
    }
}
