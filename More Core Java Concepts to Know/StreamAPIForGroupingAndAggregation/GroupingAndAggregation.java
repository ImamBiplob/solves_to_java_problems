package StreamAPIForGroupingAndAggregation;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingAndAggregation {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Imam", "Technical", 10000));
        employees.add(new Employee("Biplob", "HR", 9000));
        employees.add(new Employee("Rakib", "Technical", 8000));

        var groupedEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(groupedEmployees);   // Average salary for all departments

        DoubleSummaryStatistics summary = employees.stream().mapToDouble(Employee::getSalary).summaryStatistics();
        System.out.println(summary.getAverage());  // Average salary for all employees
    }
}
