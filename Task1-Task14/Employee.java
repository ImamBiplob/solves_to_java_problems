public class Employee {
    private String name;
    private String employeeId = null;
    private String department = null;

    public Employee(String name, String employeeId){
        setEmployeeId(employeeId);
        setName(name);
    }

    public Employee(String name, String employeeId, String department){
        setEmployeeId(employeeId);
        setName(name);
        setDepartment(department);
    }

    public Employee(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
