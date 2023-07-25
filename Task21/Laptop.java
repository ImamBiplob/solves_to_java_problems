package Task21;

public class Laptop extends Computer {
    private double batteryCapacity;
    private double weight;

    public Laptop() {
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setMonitor(new Monitor("1920*1080", 144, "Samsung"));
        laptop.setWeight(1.5);
        laptop.setBatteryCapacity(1400);
        laptop.setRam(16);
        laptop.setProcessor("AMD Ryzen 7 5800H");
        laptop.setDiskSpace(512);

        System.out.println(laptop.toString());
    }
}
