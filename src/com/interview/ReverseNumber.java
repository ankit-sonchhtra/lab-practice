package com.interview;

// Reverse a Number regardless of its sign either positive/negative
class ReverseNumber {
    public int reverse(int x) {
        boolean flag = false;
        int rev=0;
        if(x < 0){
            x = x * -1;
            flag = true;
        }

        while (x != 0) {
            int r = x % 10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && r > 7){
                return 0 ;
            }

            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && r < -8){
                return 0 ;
            }

            rev = (rev * 10)+r;
        }

        if(flag)
            return rev * -1;

        return rev;
    }
}