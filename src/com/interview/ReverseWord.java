package com.interview;

public class ReverseWord {

    public static void main(String[] args) {

        String str = "I love programming very much";

        String newStr = "";

        String[] s = str.split(" ");
        for (String value : s) {
            StringBuilder sb = new StringBuilder(value);
            newStr = newStr + " " + sb.reverse();
        }
        System.out.println(newStr);
    }
}
