package lesson_9;

public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working hours: " + workingHours);
            System.out.println("Cost: $" + cost);
        }
    }

    public void displayParkInfo() {
        System.out.println("Welcome to " + parkName + " park!");
    }
}
