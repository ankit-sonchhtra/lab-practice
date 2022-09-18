package com.interview;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
	// write your code here

//        Optional<String> optionalWithNull = Optional.ofNullable("");
//        System.out.println(optionalWithNull.isPresent());

        Optional<String> strOptional = Optional.ofNullable(null);
        System.out.println(strOptional.orElse("Its null value"));
        System.out.println(strOptional.orElseThrow(RuntimeException::new));
    }
}
