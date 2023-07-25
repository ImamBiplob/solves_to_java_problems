package Task21;

public class Computer {
    private Monitor monitor;
    private int ram;
    private String processor;
    private int diskSpace;

    public Computer() {
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "monitor=" + monitor +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", diskSpace=" + diskSpace +
                '}';
    }
}
