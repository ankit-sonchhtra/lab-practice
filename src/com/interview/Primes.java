package com.interview;

public class Primes {
    public static void main(String[] args) {
        int k =2;
        int number = 120;
        while (number > 1) {
            if (number % k == 0) {
                System.out.println(k);
                number = number / k ;
            } else {
                k = k+1;
            }
        }
    }
}
