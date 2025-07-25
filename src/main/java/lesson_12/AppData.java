package lesson_12;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < header.length; i++) {
            result += header[i];
            if (i < header.length - 1) {
                result += ";";
            }
        }
        result += "\n";

        for (int[] row : data) {
            for (int i = 0; i < row.length; i++) {
                result += row[i];
                if (i < row.length - 1) {
                    result += ";";
                }
            }
            result += "\n";
        }

        return result;
    }

}
