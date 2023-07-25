public class AllInOnePrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("All in one print");
    }
    @Override
    public void scan() {
        System.out.println("All in one scan");
    }
}
