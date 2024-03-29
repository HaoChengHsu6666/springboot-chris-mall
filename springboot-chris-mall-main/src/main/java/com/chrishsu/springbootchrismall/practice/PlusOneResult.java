package com.chrishsu.springbootchrismall.practice;

// 給一整數陣列digits,回傳digits數字+1後的結果
// ex : digits[1,2,3] return[1,2,4] ; digits digits[2,9,9] return[3,0,0]
// digits不會有0開頭, ex : digits[0,1,2,3]

public class PlusOneResult {

    // 要有實例才可呼叫,對映著第40行
    // public int[] plusOne(int[] digits){
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        // 從陣列中最後一個元素開始迭代
        for(int i=n-1 ; i>=0 ; i--){
            // 將當前的位數(數字)+1
            digits[i]++;
            // 如果當前的位數數字不等於10,表示不用進位,直接回傳加1後的結果
            if(digits[i] != 10){
               return digits;
            }
            // 把當前的位數設為0表示進位,之後繼續判斷下一個位數
            digits[i] = 0;
        }
        /* 如果當前陣列的最高位數也(每個位數都)需要進位,
        則需新增一組比原先傳進來的陣列寬一位數的陣列,
        並將新陣列最高的位數設成1 (都是0的其他位數則因陣列初始化預設就是0為0)
         */
        int[] result = new int[n+1];
        result[0] = 1;
        digits = result;
        return digits;
    }

    public static void main(String[] args){
//      int[] digits =  plusOne(new int[]{1, 3, 0});

        int[] nums = {9,9,9};
        int[] digits = plusOne(nums);

        // 創建實例呼叫無static之方法
//        PlusOneResult instance = new PlusOneResult();
//        int[] digits = instance.plusOne(nums);

          for(int num : digits){
              System.out.print(num);
          }
    }
}
