package com.interview;

public class ReverseWord {

    public static void main(String[] args) {

        String str = "I love programming very much";

        char ch;

        String newStr = "";

        String[] s = str.split(" ");
        for (int i = 0;i<s.length;i++) {
            String nstr = "";
            for (int j=0; j<s[i].length(); j++)
            {
                StringBuilder sb = new StringBuilder(s[i]);
                nstr = sb.reverse().toString();
            }
            newStr = newStr + " " + nstr;
        }
        System.out.println(newStr);
    }
}
