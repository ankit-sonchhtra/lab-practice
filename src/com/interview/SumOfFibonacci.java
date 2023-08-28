package com.interview;

//  0 1 1 2 3 5 8
public class SumOfFibonacci {
    public static void main(String[] args) {
        int input = 5;
        System.out.println("\n"+ sumOfFibonacci(input));
    }

    static int sumOfFibonacci(int input) {
        int a, b = 0, sumf = 1;
        if (input <= 0)
            sumf = 0;
        int curr = 1;
        for(int i = 1; i < input; i++){
            a = b;
            b = curr;
            curr = a+b;
            sumf += curr;
        }
        return sumf;
    }
}
