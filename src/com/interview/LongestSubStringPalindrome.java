package com.interview;

class LongestSubStringPalindrome {
    public String longestPalindrome(String s) {
        String result = "";
        if (s.length() <= 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subStr = s.substring(i, j + 1);
                if (isPalindrome(subStr) && subStr.length() > result.length()) {
                    result = subStr;
                }
            }
        }

        return result;
    }

    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}