package CreatingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        // A stream consists of a source followed by zero or more intermediate methods combined together(pipelined) and
        // a terminal method to process the objects obtained from the source as per the methods described.
        // Stream is used to compute elements as per the pipelined methods without altering the original value of the object.

        Stream<Integer> stream = Stream.of(1,2,3,4,5);  // Stream using Stream.of()
        stream.forEach(System.out::println);

        int []arr = {2,4,8,16};
        int sum = Arrays.stream(arr).sum();  // Stream from array
        System.out.println(sum);

        List<Integer> numbers = Arrays.asList(1,3,5,7);
        numbers.stream().map(i -> i+1).collect(Collectors.toList()).forEach(System.out::println);  // Stream from collection
    }
}
