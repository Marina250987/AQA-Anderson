package lesson_10;

public class ArraySwapper {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        T swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
}