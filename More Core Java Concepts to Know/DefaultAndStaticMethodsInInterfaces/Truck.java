package DefaultAndStaticMethodsInInterfaces;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck has started");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped");
    }

    public static void main(String []args) {
        Vehicle truck = new Truck();

        truck.start();
        truck.honk();
        truck.stop();
        Vehicle.inspect();
    }
}

