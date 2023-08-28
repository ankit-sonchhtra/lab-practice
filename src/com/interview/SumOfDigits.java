package com.interview;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(solution(2345));
    }

    static int solution(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        return sum;
    }
}


