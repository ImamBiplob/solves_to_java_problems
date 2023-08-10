package InterfaceInheritance;

public class Rectangle implements Resizable {

    private int height;
    private int width;
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle of height " + height + " and width " + width);
    }

    @Override
    public void resize(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.resize(2,3);
        rectangle.draw();
    }
}
