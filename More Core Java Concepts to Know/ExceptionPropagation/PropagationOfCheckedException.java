package ExceptionPropagation;

import java.io.IOException;

public class PropagationOfCheckedException {
    void m() throws IOException { // Exception propagated to n()
        // Checked exception occurred
        throw new IOException("Device error");
    }


    void n() throws IOException { // Exception propagated to p()
        m();
    }

    void p() {
        try {
            n(); // Exception handled here
        }
        catch (Exception e) {
            System.out.println("Exception handled of " + e);
        }
    }

    public static void main(String args[])
    {
        PropagationOfCheckedException obj = new PropagationOfCheckedException();
        obj.p();
        System.out.println("Program continues...");
    }
}
