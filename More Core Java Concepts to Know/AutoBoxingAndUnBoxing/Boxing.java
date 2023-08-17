package AutoBoxingAndUnBoxing;

public class Boxing {

    public static void main(String[] args) {

        Integer i = new Integer(1);
        int i1 = i;  // Unboxing the Wrapper class object to a primitive type
        System.out.println(i1);

        char ch = 'I';
        Character c = ch;  // Autoboxing the primitive type to a Wrapper class object
        Character c1 = 'm'; // Autoboxing of a character
        char c2 = c1;  // Auto-unboxing of character
        System.out.println(c);
        System.out.println(c2);

    }

}
