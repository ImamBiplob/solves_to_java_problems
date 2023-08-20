package StreamIntermediateAndTerminalOps;

import StreamAPIForGroupingAndAggregation.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOps {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(64,1,2,4,8,16,32);
        int sumOfFilteredNumbers = numbers.stream()
                .filter(n -> n%4==0)
                .map(n -> n*n)
                .reduce(0,(sum,i) -> sum+i);
        System.out.println(sumOfFilteredNumbers);

        numbers.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Employee> employees = List.of(new Employee("Imam", "Technical", 10000),
                new Employee("Biplob", "HR", 9000),
                new Employee("Rakib", "Technical", 8000));
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
