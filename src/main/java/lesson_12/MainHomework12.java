package lesson_12;

import java.io.*;
import java.util.Arrays;

public class MainHomework12 {
    public static void main(String[] args) {
      String filePath = "C:\\Users\\Roma\\Desktop\\File1.csv";
      String [] header = {"Value 1", "Value 2", "Value 3"};
      int [][] data = {
              {100, 200, 123},
              {300, 400, 500}
      };

        AppData appData = new AppData(header, data);
        System.out.println("Befor serialization: \n" + appData);

        byte[] byteArrayData = null;
        try (FileOutputStream fileout = new FileOutputStream(filePath);
             ObjectOutputStream objOut = new ObjectOutputStream(fileout)) {
            objOut.writeObject(appData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
            AppData readAppData = (AppData) objIn.readObject();
            System.out.println("Data after deserialization: \n" + readAppData);
        } catch (IOException |  ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
