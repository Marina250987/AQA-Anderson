package lesson_9;

public class Cat extends Animal {
    private static int catCount = 0;
    private final int MAX_RUN_DISTANCE = 200;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(name + " can't run that far. Maximum is " + MAX_RUN_DISTANCE + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim!");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isFull = true;
            System.out.println(name + " ate " + amount + " units of food and is now full.");
        } else {
            System.out.println(name + " didn't eat because there's not enough food in the bowl.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
