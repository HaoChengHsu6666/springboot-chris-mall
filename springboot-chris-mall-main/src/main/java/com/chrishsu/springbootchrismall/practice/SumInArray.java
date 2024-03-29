package com.chrishsu.springbootchrismall.practice;



/* 給一整數陣列nums、一目標整數target,
    回傳nums中兩個數字第索引值i與j,
    使num[i] + nums[j] = target

    Ex: input nums[1,2,5,9] target = 10 output [0,3]
    可能有多組解,回傳一組即可
 */

public class SumInArray {
    public static int[] sumInArray(int[] nums,int target){
        int[] output = {-1,-1};
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            for (int j=i+1; j<n ; j++){
                if(nums[i]+nums[j] == target){
                    output[0] = i ;
                    output[1] = j ;
                    return output;
                }
            }
        }
        return output;
    }



    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int[] targetNums = sumInArray(nums,16);
        for(int targetNum : targetNums){
            // -1,-1 表示無找到對應的兩個值
            System.out.print(targetNum + ",");
        }

    }
}
