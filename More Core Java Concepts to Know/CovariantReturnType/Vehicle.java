package CovariantReturnType;

public class Vehicle {

    public int b = 3;
    public Vehicle getInstance() {
        return new Vehicle();
    }
}
