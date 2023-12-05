package com.interview;

import java.util.ArrayList;
import java.util.List;

public class FirstRecurring {

    public static void main(String[] args) {
        System.out.println(getFirstRecurringDigit(new int[]{2,1,1,2,3,4,5}));
    }

    public static String getFirstRecurringDigit(int[] array) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            if (arrayList.contains(i)) {
                return Integer.toString(i);
            } else {
                arrayList.add(i);
            }
        }
        return "No recurring number";
    }
}
