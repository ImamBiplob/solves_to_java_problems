package ExceptionHierarchyAndTryCatchBlocks;

public class ExceptionHierarchyAndTryCatch {
    public static void main(String[] args) {
        // Throwable class is in the top of hierarchy. Exception class and Error class extend This Throwable class.
        // Exceptions except RuntimeException and Error are known as Checked Exceptions. They are checked at compile-time.
        // Examples of Checked Exceptions: IOException, SQLException, etc.
        // The classes that inherit the RuntimeException class are Unchecked Exceptions. They are checked at runtime not compile-time.
        // Examples of Unchecked Exceptions: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
        // Errors are irrecoverable. For example: OutOfMemoryError, VirtualMachineError, AssertionError etc.

        try {
            int arr[] = new int[5];
            //int arr[] = null;
            arr[5] = 2/1;
        }
        // Must be ordered from most specific to most general in case of multiple catch blocks
        catch(ArithmeticException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program continues...");
    }
}
