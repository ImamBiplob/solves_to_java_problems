public class Rectangle extends Shape{
    public double length;
    public double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
