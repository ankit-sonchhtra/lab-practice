package com.interview;

//  0 1 1 2 3 5 8
public class SumOfFibonacci {
    public static void main(String[] args) {
        int input = 7;
        System.out.println("\n"+ sumOfFibonacci(input));
    }

    static int sumOfFibonacci(int input) {
        int a, b = 0, sum = 1, curr = 1;;
        if (input <= 1)
            return 0;
        for(int i = 1; i < input-1; i++){
            a = b;
            b = curr;
            curr = a+b;
            sum += curr;
        }
        return sum;
    }
}
