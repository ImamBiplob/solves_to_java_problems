package ExceptionPropagation;

public class PropagationOfUncheckedException {
    void m() {
        int data = 50 / 0; // Unchecked exception occurred
        // Exception propagated to n()
    }

    void n() {
        m();
        // Exception propagated to p()
    }

    void p() {
        try {
            n(); // Exception handled here
        }
        catch (Exception e) {
            System.out.println("Exception handled of " + e);
        }
    }

    public static void main(String args[]) {
        PropagationOfUncheckedException obj = new PropagationOfUncheckedException();
        obj.p();
        System.out.println("Program continues...");
    }
}
