package lesson_9;

public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Added " + amount + " units of food to the bowl. Total: " + foodAmount);
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
