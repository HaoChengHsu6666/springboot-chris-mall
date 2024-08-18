package com.chrishsu.springbootchrismall.practice;

/*
Question：
* 給你一個非嚴格遞增排列的數組nums，請你原地刪除重複出現的元素，
* 使每個元素只出現一次，返回刪除後數組的新長度。元素的相對順序應該保持一致。
* 然後傳回nums中唯一元素的個數。
*
hint：
* 考慮nums的唯一元素的數量為k，你需要做以下事情確保你的題解可以被通過：
* 更改數組nums，使nums的前k個元素包含唯一元素，
* 並按照它們最初在nums中出現的順序排列。nums 的其餘元素與nums的大小不重要。
*
*
範例1：

輸入： nums = [1,1,2]
輸出： 2, nums = [1,2,_]
解釋：函數應該返回新的長度2，並且原數組nums的前兩個元素被修改為1,
不需要考慮數組中超出新長度後面的元素。

範例2：
輸入： nums = [0,0,1,1,1,2,2,3,3,4]
輸出： 5, nums = [0,1,2,3,4]
解釋：函數應該回傳新的長度5， 而原數組nums的前五個元素被修改為0, 1, 2, 3, 4。
不需要考慮數組中超出新長度後面的元素。
*



Ans：
下面兩段程式碼都是用來移除陣列中重複的元素，並且傳回不重複元素的數量。但它們的實作方式略有不同，下面我們來比較一下它們的差異：

第一段程式碼是修改原地數組的實作方式，不使用額外的陣列空間。它透過維護一個uniqueIndex來記錄下一個不重複元素應該放置的位置，
並遍歷數組將不重複的元素依序放置到對應位置。最後回傳的uniqueIndex + 1即為不重複元素的數量。

第二段程式碼使用了額外的陣列newNums來儲存不重複的元素，然後將其複製回原始數組。在遍歷數組過程中，它也記錄了不重複元素的個數，
但最後回傳的是count，即不重複元素的個數，而不是修改後的原始數組。另外，它在計算不重複元素的個數時，
採取了一種有點複雜的方法，首先檢查了數組的第一個元素是否為0，然後再遍歷數組計算大於0的元素的個數。

總的來說，第一段程式碼更加簡潔和高效，它不需要額外的數組空間，並且直接修改了原始數組，時間複雜度為O(n)，空間複雜度為O(1)。
而第二段程式碼使用了額外的陣列空間，時間複雜度也是O(n)，但空間複雜度為O(n)，且實作稍顯複雜。

* */

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        // GPT 解答：修改原數組並回傳不重複的個數總數 (較符合題意)

        int uniqueIndex = 0; // 记录唯一元素应该放置的位置

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // 将当前不重复的元素放置到相应的位置
            }
        }

        return uniqueIndex + 1; // 返回唯一元素的个数，即uniqueIndex + 1

        // 我寫的菜逼八扣：以 (不符合題意)
//        int nl = nums.length;
//        int j = 1;
//        int[] newNums = new int[nl];
//        newNums[0] = nums[0];
//        for (int i = 0; i < nl-1; i++) {
//            if(nums[i] != nums[i+1]){
//                newNums[j] = nums[i+1];
//                j++;
//            }
//        }
//        nums = new int[j];
//        for (int k = 1; k < j; k++){
//            nums[k] = newNums[k];
//        }
//        int count = 0;
//        if (nums[0] == 0){
//            count++;
//        }
//        for (int num : nums){
//            if (num > 0){
//                count++;
//            }
//        }
//        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,3,3,4,4,4,5,5,5,5};
        System.out.print(removeDuplicates(nums));
    }
}
