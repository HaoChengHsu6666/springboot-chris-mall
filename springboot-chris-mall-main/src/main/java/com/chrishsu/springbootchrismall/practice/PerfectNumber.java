package com.chrishsu.springbootchrismall.practice;

/*
* 給一整數num,判斷是否為完美數
*
* 完美數：自己以外的所有因數加起來等於自己
*
* Ex: num = 6; return true; (因位6因數為1,2,3,6 1+2+3=6)
*/

public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        if (num <= 1) {
            return false; // 完美数必须大于1
        }

        int sum = 1; // 初始化因子之和，1 是所有数的因子

        // 遍历从 2 到 num/2 的所有可能因子
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // 如果 i 是 num 的因子，将其加入到因子之和中
            }
        }

        // 如果因子之和等于 num，则 num 是完美数
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(496));
        System.out.print(isPerfectNumber(32));
    }
}
