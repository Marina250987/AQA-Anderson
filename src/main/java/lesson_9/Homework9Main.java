package lesson_9;

public class Homework9Main {
    public static void main(String[] args) {
        System.out.println("=== Animals========");
        Dog dog = new Dog("Bobik");
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik");

        dog.run(150);
        dog.run(600);
        dog.swim(5);
        dog.swim(15);

        cat1.run(100);
        cat1.run(300);
        cat1.swim(1);

        System.out.println("\nAnimal counts:");
        System.out.println("Total animals: " + Animal.getAnimalCount());
        System.out.println("Total dogs: " + Dog.getDogCount());
        System.out.println("Total cats: " + Cat.getCatCount());

        System.out.println("\n=== Cats and Bowl ===========");
        Bowl bowl = new Bowl(20);
        Cat[] cats = {cat1, cat2, new Cat("Chernysh"), new Cat("Tom")};

        System.out.println("\nFeeding cats:");
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("\nCat fullness status:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " is " + (cat.isFull() ? "full" : "hungry"));
        }

        bowl.addFood(30);
        System.out.println("\nAfter adding food to the bowl:");

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 15);
            }
        }

        System.out.println("\nFinal cat fullness status:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " is " + (cat.isFull() ? "full" : "hungry"));
        }

        System.out.println("\n=== Payment ==========");
        Payment payment = new Payment("PAYMENTCOSMETICS");
        Payment.Item item1 = payment.new Item("Lipstick", 22.00);
        Payment.Item item2 = payment.new Item("Creame", 82.50);
        Payment.Item item3 = payment.new Item("Parfume", 125.75);

        Payment.Item[] items = {item1, item2, item3};
        payment.processPayment(items);


        System.out.println("\n=== Park ==========");
        Park park = new Park("Parkland");
        park.displayParkInfo();

        Park.Attraction attraction1 = park.new Attraction("Star", "10:00-20:00", 15.00);
        Park.Attraction attraction2 = park.new Attraction("Ship", "11:00-21:00", 7.50);

        System.out.println("\nPark attractions:");
        attraction1.displayInfo();
        System.out.println();
        attraction2.displayInfo();
    }
}