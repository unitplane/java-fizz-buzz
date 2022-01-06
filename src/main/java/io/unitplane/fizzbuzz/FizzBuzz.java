package io.unitplane.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public List<String> calculate() {
        return IntStream.rangeClosed(1, 100)
                .mapToObj(i -> {
                    String[] output = {"FizzBuzz", "Buzz", "Fizz", String.valueOf(i)};
                    List<Integer> index = Arrays.asList(i % 15, i % 5, i % 3, 0);
                    return output[index.indexOf(0)];
                }).collect(Collectors.toCollection(ArrayList::new));
    }
}
