package ChainedExceptions;

public class ChainedExceptionsWithConstructors {
    public static void main(String[] args) {
        try {
            // code that might throw an exception
            int[] numbers = new int[5];
            int divisor = 0;
            for (int i = 0; i < numbers.length; i++) {
                int result = numbers[i] / divisor;
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            // create a new exception with the original exception as the cause
            throw new RuntimeException("Error: division by zero", e);
        }
    }
}
