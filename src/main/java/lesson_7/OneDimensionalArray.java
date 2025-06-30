package lesson_7;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int len = 10;
        int initialValue = 7;

        int[] array = createArray(len, initialValue);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
