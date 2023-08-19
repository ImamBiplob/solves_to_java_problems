package ThrowingExceptions;

public class ThrowingExceptions {

    public static void method(int a) {
        if(a < 0)
            throw new IllegalArgumentException("Value should not be negative");
    }

    public static void main(String[] args) {
        method(-2);
        System.out.println("Program continues...");
    }
}
