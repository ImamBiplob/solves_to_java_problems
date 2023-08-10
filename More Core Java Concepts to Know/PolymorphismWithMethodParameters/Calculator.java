package PolymorphismWithMethodParameters;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public double add(double c, double d) {
        return c+d;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(2.0, 3.0));
    }
}
