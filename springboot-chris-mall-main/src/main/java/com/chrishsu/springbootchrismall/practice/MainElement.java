package com.chrishsu.springbootchrismall.practice;

/*
* Questoin：
* 給定一個大小為n 的數組 nums，並傳回其中的多數元素。
* 多數元素是指在陣列中出現次數大於 " n/2 " 的元素。
* 你可以假設數組是非空的，並且給定的數組總是存在多數元素。
*
* */

import java.util.OptionalInt;

public class MainElement {

    public static int findMainElement (int[] nums){
        int element = nums[0];
        int count = 1;
        int nl = nums.length;
        for(int i = 1; i < nl; i++){
            if (element == nums[i]){
                count++;
            }else
            {
                count--;
                if (count == 0){
                    element = nums[i];
                    count = 1;
                }
            }
        }
        // 驗證此element是否有大於數組長度的一半
        count = 0;
        for(int num : nums){
            if(num == element){
                count++;
            }
        }
        return count > nl/2 ? element : -1 ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1,3,1,3,4,3,3};
        System.out.print(findMainElement(nums));
    }
}
