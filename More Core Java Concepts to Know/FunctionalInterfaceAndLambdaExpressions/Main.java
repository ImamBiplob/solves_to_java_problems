package FunctionalInterfaceAndLambdaExpressions;

public class Main {
    public static void main(String[] args) {
        add(( a, b) -> { return a+b; } ); // Using Lambda Expression
        add(Integer::sum);                // Using Method Reference
    }

    public static void add(Calculator calculator) {
        System.out.println(calculator.calculate(3,2));
    }
}
