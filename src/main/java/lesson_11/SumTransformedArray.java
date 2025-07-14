package lesson_11;

public class SumTransformedArray {
    public int sumTransformedArray(String[][] initialArray) throws MyArraySizeException, MyArrayDataException{

        if (initialArray.length != 4) {
            throw new MyArraySizeException("The array must be 4x4 in size");
        }

        for (String[] row : initialArray) {
            if (row.length != 4) {
                throw new MyArraySizeException("The array must be 4x4 in size");
            }
        }

        System.out.println("Transformed array: ");
        int sum = 0;
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray[i].length; j++) {
                try {
                    int intValue = Integer.parseInt(initialArray[i][j]);
                    System.out.print(intValue + " ");
                    sum += intValue;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Incorrect data in cell [" + i + "][" + j + "]");
                }
                            }
            System.out.println();
        }
        return sum;
    }
}