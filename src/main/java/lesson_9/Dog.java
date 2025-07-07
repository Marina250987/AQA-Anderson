package lesson_9;

public class Dog extends Animal {
    private static int dogCount = 0;
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (distance <= MAX_SWIM_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(name + " can't swim that far. Maximum is " + MAX_SWIM_DISTANCE + " meters.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
