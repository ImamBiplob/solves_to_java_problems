package MethodOverridingAndSuperKeyword;

public class Manager extends Employee {
    public String department;

    public Manager(String name, String employeeId, int salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}
