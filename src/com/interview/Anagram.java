package com.interview;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "INTEGRAL";
        String s2 = "TRIANGLE";

        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        char[] str1 = s1.toCharArray();
        for(char c: str1) {
            int index = s2.indexOf(c);
            if(index != -1)
                s2 = s2.substring(0, index) + s2.substring(index + 1);
            else
                return false;
        }
        return s2.isEmpty();
    }
}
