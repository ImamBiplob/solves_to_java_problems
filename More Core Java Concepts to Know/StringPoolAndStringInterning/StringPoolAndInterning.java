package StringPoolAndStringInterning;

public class StringPoolAndInterning {

    // A string pool is a special storage space in the Java heap memory where string literals are stored.
    // It helps to avoid creating multiple String objects with the same value, which saves memory and improves performance.
    // String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.
    // The String.intern() method puts the string in the String pool or refers to another String object from the string pool having the same value.


    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java").intern();
        System.out.println((s1 == s2)+", String are equal."); // true
        System.out.println((s1 == s3)+", String are not equal because different memory location"); // false
        System.out.println(s1.equals(s3)); // true because same value though different objects in different locations
        System.out.println((s1 == s4)+", String are equal."); // true because same value and same object in string pool
    }

}
