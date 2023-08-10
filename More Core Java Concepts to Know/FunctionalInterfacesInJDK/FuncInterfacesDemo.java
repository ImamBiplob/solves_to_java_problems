package FunctionalInterfacesInJDK;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterfacesDemo {

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        Consumer<String> consumer1 = FuncInterfacesDemo::greet;  // Using method reference
        consumer1.accept("Biplob");  // No return
        Consumer<String> consumer2 = name -> System.out.println("Hello " + name); // Using Lambda Expression
        consumer2.accept("Imam");

        Predicate<Integer> predicate = number -> number > 10;
        System.out.println(predicate.test(4));  // Boolean return


        Function<String, Boolean> function = name -> name.contains("m");
        System.out.println(function.apply("Imam"));

        Supplier<Integer> supplier = () -> 2+2;
        System.out.println(supplier.get());

    }
}
