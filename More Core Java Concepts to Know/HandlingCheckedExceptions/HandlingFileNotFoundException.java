package HandlingCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingFileNotFoundException {
    // Checked exceptions are the subclass of the Exception class.
    // ClassNotFoundException, IOException, SQLException etc. are the examples of the checked exceptions.
    // These types of exceptions need to be handled during the compile time of the program.
    // These exceptions can be handled by the try-catch block or by using throws keyword otherwise the program will give a compilation error.

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(
                    "/abc.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
