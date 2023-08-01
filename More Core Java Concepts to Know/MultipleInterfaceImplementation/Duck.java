package MultipleInterfaceImplementation;

public class Duck implements Flyable, Swimmable {
    public Duck() {
    }

    @Override
    public void fly() {
        System.out.println("Duck is Flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is Swimming");
    }

    public static void main(String []args) {
        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}
