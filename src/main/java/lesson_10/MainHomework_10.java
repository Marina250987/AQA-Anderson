package lesson_10;

public class MainHomework_10 {
    public static void main(String[] args) {

        String[] strings = {"one", "two", "three"};
        ArraySwapper.swapElements(strings, 0, 2);
        for (String str : strings) {
            System.out.println(str);
        }

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        orangeBox.addFruit(new Orange());

        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight());

        System.out.println("appleBox1 and appleBox2 have equal weight: " + appleBox1.compare(appleBox2));
        System.out.println("appleBox1 and orangeBox have equal weight: " + appleBox1.compare(orangeBox));
    }
}
