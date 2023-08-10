package InheritanceAndInterface;

public class Square implements Shape, Colorable {


    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    public static void main(String[] args) {

        Square square = new Square(2.0);

        square.setColor("Green");

        System.out.println(square.getArea());
        System.out.println(square.getColor());

    }
}
