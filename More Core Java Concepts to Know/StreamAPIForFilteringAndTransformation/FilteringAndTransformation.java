package StreamAPIForFilteringAndTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndTransformation {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List evenNumbers = numbers.stream().filter(e -> e % 2 == 0).map(e -> e*e).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
