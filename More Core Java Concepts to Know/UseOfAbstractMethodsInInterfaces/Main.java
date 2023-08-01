package UseOfAbstractMethodsInInterfaces;

public class Main {
    public static void main(String []args) {
        Shape circle = new Circle(4);
        Shape square = new Square(2);

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());

        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}
