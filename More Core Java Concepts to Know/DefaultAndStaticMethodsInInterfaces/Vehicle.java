package DefaultAndStaticMethodsInInterfaces;

public interface Vehicle {
    void start();

    void stop();

    default void honk() {
        System.out.println("Vehicle Honk!!!");
    }

    static void inspect() {
        System.out.println("Vehicle Inspect...");
    }
}
