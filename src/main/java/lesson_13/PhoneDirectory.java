package lesson_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, List<String>> directory = new TreeMap<>();

    public void add(String lastName, String phoneNumber) {

        if (!directory.containsKey(lastName)) {
            directory.put(lastName, new ArrayList<>());
        }
            directory.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        if (directory.containsKey(lastName)) {
            return directory.get(lastName);
        } else {
            return new ArrayList<>();
        }
    }

    public void printDirectory() {
        for (HashMap.Entry<String, List<String>> entry : directory.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", phone numbers: " + entry.getValue());
        }
    }
}
