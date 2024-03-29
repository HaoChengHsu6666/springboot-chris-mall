package com.chrishsu.springbootchrismall.practice;

// 給一數字n,回傳此數是否為2的次方數,是為true，否則false
public class PowerOfTwo{
    public static boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        while (n>1){
            if(n%2 != 0){
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(isPowerOfTwo(31));
    }
}
