package io.unitplane.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        var fizzbuzz = new FizzBuzz();
        var output = fizzbuzz.calculate();
        output.forEach(System.out::println);
    }

}
