package ir.afaghsoft.crud;

import java.util.Optional;

public class DemoTest {

    public static void main(String[] args) {

        Integer value = Optional.of("small")
                .map(String::length)
                .get();

        System.out.println(value);
    }
}
