package CovariantReturnType;

public class Car extends Vehicle {

    public int a = 2;

    @Override
    public Car getInstance() {
        return new Car();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        Vehicle vehicle1 = vehicle.getInstance();
        Car car1 = car.getInstance();

        System.out.println(vehicle1.b);
        System.out.println(car1.a);
    }
}
