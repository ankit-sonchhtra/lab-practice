package com.interview;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {


    public static void main(String[] args) {
        Stream<String> streamArray = Stream.of("aaa", "aaab", "aaabc");
        Stream<String> a = streamArray.filter(e -> e.startsWith("aaab"));
        a.forEach(System.out::println);

        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.forEach(System.out::print);

        System.out.print(" ");
        list.parallelStream().forEach(System.out::print);

        System.out.println();
        List<Integer> integers = Arrays.asList(2, 1, 1);
        Integer reduced = integers.stream().reduce(23, Integer::sum);

        System.out.println(reduced);

//        Details detail1 = new Details(1,  "Ankit", "Rajkot");
//        Details detail2 = new Details(2,  "Sagar", "Surat");
//        Details detail3 = new Details(3,  "Milan", "Ahmedabad");
//
//        List<Details> listOfDetails = Arrays.asList(detail1, detail2, detail3);
//
//        Stream<Details> sorted = listOfDetails.stream().sorted();
//        sorted.forEach(System.out::println);


        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        streamIterated.forEach(System.out::println);


    }
}
