package lesson_9;

public class Payment {
    private String paymentId;

    public Payment(String paymentId) {
        this.paymentId = paymentId;
    }


    public class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

      public void processPayment(Item[] items) {
        double total = 0;
        System.out.println("Processing payment " + paymentId + ":");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total amount: $" + total);
    }
}