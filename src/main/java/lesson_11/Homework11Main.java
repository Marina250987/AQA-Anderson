package lesson_11;

public class Homework11Main {
    public static void main(String[] args) {

        String[][] initialArray = {{"1", "5", "3", "4"},
                                   {"5", "6", "7", "8"},
                                   {"9", "10", "11", "12"},
                                   {"13", "14", "15", "16"}};
        System.out.println("Initial array: ");
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray[i].length; j++) {
                System.out.print(initialArray[i][j] + " ");
            }
            System.out.println();
        }
        try {
            SumTransformedArray sumTransformer = new SumTransformedArray();
            int totalSum = sumTransformer.sumTransformedArray(initialArray);
            System.out.println("Sum of array elements: " + totalSum);
        } catch (MyArraySizeException e) {
            System.err.println("Array size error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Array data error: " + e.getMessage());
        }


    }
}

