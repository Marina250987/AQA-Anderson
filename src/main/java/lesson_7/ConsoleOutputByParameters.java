package lesson_7;

public class ConsoleOutputByParameters {
    public static void printStringMultipleTimes(String str, int times) {

        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        String myString = "Hello!";
        int numberOfTimes = 5;
        printStringMultipleTimes(myString, numberOfTimes);
    }
}
