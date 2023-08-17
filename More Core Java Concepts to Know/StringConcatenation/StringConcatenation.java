package StringConcatenation;

public class StringConcatenation {
    public static void main(String[] args) {

        // The + operator is more flexible and convenient,
        // as it can handle null values and convert any argument to a string using the toString() method.
        // It also allows you to concatenate more than two strings in one expression.

        // The concat() method is more strict and efficient,
        // as it only accepts string values and produces a new string with the result of concatenation.
        // It may be faster than the + operator if you only need to concatenate two strings.

        // Using the + operator
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2; // "Hello World"
        String s4 = s1 + null; // "Hellonull"
        System.out.println(s4);
        String s5 = s1 + 42; // "Hello42"
        System.out.println(s5);

        // Using the concat() method
        String s6 = "Hello";
        String s7 = "World";
        String s8 = s6.concat(" ").concat(s7); // "Hello World"
        System.out.println(s8);
        String s9 = s6.concat(null); // NullPointerException
        System.out.println(s9);
        //String s10 = s6.concat(42); // Compile error
    }
}
