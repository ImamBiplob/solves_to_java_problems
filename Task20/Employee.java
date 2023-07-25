package Task20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee implements java.io.Serializable {
    private int employeeId;
    private String name;

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            Employee employee = new Employee();
            employee.setEmployeeId(123);
            employee.setName("Imam");

            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(employee);
            out.flush();
            out.close();
            System.out.println("Serialization Done");

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
            Employee e = (Employee)in.readObject();
            System.out.println("Deserialization Done");
            System.out.println("ID: " + e.employeeId + ", " + "Name: " + e.name);

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
