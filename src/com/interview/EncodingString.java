//Given a string, return its encoding defined as follows:
//
//        First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
//        for example, "aabbbc" is divided into ["aa", "bbb", "c"]
//        Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
//        for example, substring "bbb" is replaced by "3b"
//        Finally, all the new strings are concatenated together in the same order and a new string is returned.
//        Example
//
//        For s = "aabbbc", the output should be
//        solution(s) = "2a3bc".
//

package com.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncodingString {
    public static void main(String[] args) {
        System.out.println(solution("aabbccc"));
    }

    static String solution(String s) {
        Matcher matcher = Pattern.compile("(.)\\1*").matcher(s);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            int len = matcher.group(0).length();
            char firstChar = matcher.group(0).charAt(0);
            result.append(len == 1 ? "" : len).append(firstChar);
        }
        return result.toString();
    }
}
