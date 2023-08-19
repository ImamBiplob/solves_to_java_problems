package ChainedExceptions;

public class ChainedExceptionsWithMethods {
    // In Java, a chained exception is a technique that enables programmers to associate one Exception with another.
    // By providing additional information about a specific exception, debugging can be made easier.

    public static void main(String[] args) {
        try {
            String s = null;
            int num = Integer.parseInt(s); // the line will throw a NumberFormatException
        } catch (NumberFormatException e) {
            // create a new RuntimeException with the message "Exception."
            RuntimeException ex = new RuntimeException("Exception");
            // set the cause of the new Exception to a new NullPointerException with the message " It is actual cause of the exception "
            ex.initCause(new NullPointerException("It is actual cause of the exception"));
            // throw the new Exception with the chained Exception
            throw ex;
        }
    }
}
