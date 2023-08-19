package FinallyBlock;

public class FinallyBlock {
    // Java finally block is always executed whether an exception is handled or not.
    // Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

    public static void main(String args[]){

        try {
            System.out.println("Try block");
            int data=25/0;
            System.out.println(data);
        }

        catch(NullPointerException e) {
        //catch(ArithmeticException e){
            System.out.println(e);
        }

        finally {
            System.out.println("Finally block");
        }

        System.out.println("Program continues...");
    }
}