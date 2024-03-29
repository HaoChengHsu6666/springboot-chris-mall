package com.chrishsu.springbootchrismall.practice;

import java.util.List;

/*
 給一prices陣列，它的第 i一個元素 prices[i]表示一個給定股票第i天的價格。
 你只能選擇某一天買進這隻股票，並選擇在未來的某一個不同的日子賣出該股票。設計一個演算法來計算你所能獲得的最大利潤。
 返回你可以從這筆交易中獲得的最大利潤。如果你不能獲取任何利潤，返回0。

 範例1：

輸入： [7,1,5,3,6,4]
輸出： 5
解釋：在第2 天（股票價格= 1）的時候買入，在第5 天（股票價格= 6）的時候賣出，最大利潤= 6-1 = 5 。
     注意利潤不能是7-1 = 6, 因為賣出價格需要大於買入價格；同時，你不能在買入前賣出股票。

範例2：
輸入： prices = [7,6,4,3,1]
輸出： 0
解釋：在這種情況下, 沒有交易完成, 所以最大利潤為0。

* */
public class StockMaxProfit {
    public static int maxProfit(int[] prices){

        if (prices == null || prices.length < 2){
            return 0; // 如果價格陣列為空或只有一個價格，則無法獲取利潤
        }

        int maxProfit = 0; // 初始化最大利潤為0
        int minPrice = prices[0]; // 初始化最低價格為第一天的價格
        int l = prices.length;

        // 我的寫法
        /*
        程式碼使用了兩層嵌套迴圈，它遍歷所有可能的買進和賣出時機點，計算每個時機點之間的差值，
        並找到其中的最大值。這個方法的時間複雜度是 O(n^2)，其中 n 是價格陣列的長度。
        它的效能在較小的輸入上可能還可以接受，但在大型輸入上，效能會變得較差。
        */

        for (int i = 0; i < l; i++) {
            for(int j = i+1; j < l; j++){
                if(prices[j] - prices[i] > maxProfit){
                    maxProfit = prices[j] - prices[i];
                }
            }
        }

        // GPT大神寫法
        /*
        程式碼使用了一個貪心算法，它遍歷價格陣列一次，並同時保持著最低價格和最大利潤。
        這個方法的時間複雜度是 O(n)，因為它只需要一次遍歷。這個方法的效能更好，尤其是在大型輸入上。
        */

//        for (int i = 1; i < l; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i]; // 更新最低價格
//            } else if (prices[i] - minPrice > maxProfit) {
//                maxProfit = prices[i] - minPrice; // 更新最大利潤
//            }
//        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{2 , 9 , 4 , 6 , 7 , 12};
        System.out.print("The Max profit is : "+ maxProfit(prices));
    }
}
