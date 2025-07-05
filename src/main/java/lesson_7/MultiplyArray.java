package lesson_7;

public class MultiplyArray {
    public static void main(String[] args) {

        int[] array = {1, 6, 3, 2, 11, 7, 5, 2, 4, 8, 9, 1};

        System.out.println("Initial array:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.println("Modified array:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

