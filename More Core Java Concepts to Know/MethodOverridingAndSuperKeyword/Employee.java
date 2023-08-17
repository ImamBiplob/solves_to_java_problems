package MethodOverridingAndSuperKeyword;

public class Employee {
    public String name;
    public String employeeId;
    public int salary;

    public Employee(String name, String employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary ;
    }

    public static void main(String[] args) {
        Employee manager = new Manager("Imam", "alpha1", 20000000, "AI Software Development");
        System.out.println(manager.toString());
    }
}
