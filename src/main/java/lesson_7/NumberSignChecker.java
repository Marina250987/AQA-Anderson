package lesson_7;

public class NumberSignChecker {

    public static boolean isNegative(int number) {

        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isNegative(-2));
        System.out.println(isNegative(7));
        System.out.println(isNegative(0));
    }
}
