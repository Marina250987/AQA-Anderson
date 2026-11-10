package lesson_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Homework13 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Marina", "Maria", "Kate", "Anna", "Jane", "Marina", "Helen", "Helen", "Julia", "Marina", "Marina"));
        System.out.println("============TASK1===================");
        System.out.println("Initial name list: ");
        System.out.println(nameList);

        List<String> uniqueNames = new ArrayList<>();

        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }

        System.out.println("Unique names: ");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        System.out.println("\nNumber of names:");
        for (String uniqueName : uniqueNames) {
            int count = 0;
            for (String name : nameList){
                if (name.equals(uniqueName)) {
                    count++;
                }
            }
            System.out.println(uniqueName + ": " + count);
        }
        // Task 2
        System.out.println("============TASK2===================");

        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Ivanoy", "2201010");
        phoneDirectory.add("Sidaray", "2309999");
        phoneDirectory.add("Ivanoy", "2170005");
        phoneDirectory.add("Piatroy", "2550005");

        phoneDirectory.printDirectory();
        System.out.println("========================");

        System.out.println("Ivanoy's phone numbers: " + phoneDirectory.get("Ivanoy"));
        System.out.println("Piatroy's phone numbers: " + phoneDirectory.get("Piatroy"));
        System.out.println("Sidaray's phone numbers: " + phoneDirectory.get("Sidaray"));


    }

}
