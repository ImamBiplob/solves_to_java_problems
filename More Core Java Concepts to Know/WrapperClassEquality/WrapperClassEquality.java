package WrapperClassEquality;

public class WrapperClassEquality {
    public static void main(String[] args) {

        Integer i = new Integer(3);
        int i1 = 2;
        double d = 3;
        System.out.println(i==i1);
        System.out.println(i.equals(i1));
        System.out.println(i.equals(d));
    }
}
