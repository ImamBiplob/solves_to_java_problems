package Task19;

public class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator adder = Arithmetic::add;
        Calculator subtractor = Arithmetic::subtract;

        System.out.println(adder.calculate(1, 2));
        System.out.println(subtractor.calculate(2, 1));
    }
}
