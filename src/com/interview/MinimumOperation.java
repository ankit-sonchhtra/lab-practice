package com.interview;

public class MinimumOperation {

    public static void main(String[] args) {
        System.out.println(minOperations("110010"));
        System.out.println(minOperations("10010100"));
    }

    public static int minOperations(String s) {
        int cnt10 = 0, cnt01 = 0;

        // If length of string is 1 then directly it return 0.
        if (s.length() == 1)
            return 0;

        for (int i = 0; i < s.length(); i++) {

            // Here it will check is it Even Index
            if (i % 2 == 0) {
                // if value is not 1, increase count10 otherwise count01
                if (s.charAt(i) != '1') {
                    cnt10++;
                } else {
                    cnt01++;
                }
            } else {
                // if value is not 0, increase count10 otherwise count01
                if (s.charAt(i) != '0') {
                    cnt10++;
                } else {
                    cnt01++;
                }
            }
        }
        return Math.min(cnt10, cnt01);
    }
}
