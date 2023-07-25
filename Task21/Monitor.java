package Task21;

public class Monitor {
    public String resolution;
    public int refreshRate;
    public String manufacturer;

    public Monitor(String resolution, int refreshRate, String manufacturer) {
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", refreshRate=" + refreshRate +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
