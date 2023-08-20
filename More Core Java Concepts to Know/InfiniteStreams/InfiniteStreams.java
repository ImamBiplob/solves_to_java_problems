package InfiniteStreams;

import java.util.Random;
import java.util.stream.IntStream;

public class InfiniteStreams {
    public static void main(String[] args) {
        IntStream
                .iterate(0, i -> i+1)
                .forEach(System.out::println);

        Random random = new Random();
        IntStream.generate(random::nextInt).forEach(System.out::println);
    }
}
