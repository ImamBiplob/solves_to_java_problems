package WrapperClassMethods;

public class WrapperClassEx {
    public static void main(String[] args) {
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);
        double d = Double.parseDouble(str);
        System.out.println(d);
        System.out.println(Integer.compare(3,4));
        System.out.println(Integer.max(3,40));
        System.out.println(Integer.valueOf("34"));


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String s = Integer.toString(i);
        System.out.println(s);
    }
}
