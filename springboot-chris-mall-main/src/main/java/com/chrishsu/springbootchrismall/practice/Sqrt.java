package com.chrishsu.springbootchrismall.practice;

// 給一數x,算出數的平方根(取整數)
// Ex: x=4 return 2 ; x=8 return 2.828427 (取2即可)
// 勿使用Math.pow or Math.sqrt
public class Sqrt {
    public static int sqrt(int x){
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 如果 mid * mid == x，则找到了整数平方根
            if (mid == x / mid) {
                return mid;
            }

            // 如果 mid * mid < x，则将 left 移动到 mid 的右侧以继续搜索更大的整数
            if (mid < x / mid) {
                left = mid + 1;
                result = mid; // 更新结果为当前 mid 值
            } else {
                // 如果 mid * mid > x，则将 right 移动到 mid 的左侧以继续搜索更小的整数
                right = mid - 1;
            }
        }

        return result;

        /*
        * 当计算一个数的平方根时，我们可以采用二分查找的方法。这种方法的基本思想是：
        * 如果一个数的平方根大于等于某个数 x，那么这个数的平方根一定位于 1 和 x 之间；
        * 反之，如果一个数的平方根小于某个数 x，那么这个数的平方根一定位于 x 和这个数本身之间。

            首先，我们定义一个范围，从 1 到待求的数 x。
            然后，我们在这个范围内进行二分查找。每次取中间值 mid，计算 mid 的平方。
            如果 mid 的平方等于 x，说明 mid 就是 x 的平方根，直接返回 mid。
            如果 mid 的平方小于 x，说明 mid 还不够大，我们将范围缩小为 mid 到 x 之间的数，并更新结果为 mid。
            如果 mid 的平方大于 x，说明 mid 太大了，我们将范围缩小为 1 到 mid 之间的数。
            不断重复这个过程，直到找到最接近 x 的整数平方根。

            举例说明：
            假设我们要计算数 8 的平方根，即 x = 8。

            1. 初始时，我们将搜索范围设定为 1 到 8 之间的数。
            我们取中间值 mid = (1+8)/2 = 4。
            mid 的平方为 4 * 4 = 16，大于 8。因此我们将搜索范围缩小为 1 到 4 之间的数。
            2. 接着，我们取中间值 mid = (1+4)/2 = 2。
            mid 的平方为 2 * 2 = 4，小于 8。因此我们将搜索范围缩小为 2 到 4 之间的数，并更新结果为 2。
            3. 继续迭代，我们发现 3 的平方为 3 * 3 = 9，大于 8。因此我们将搜索范围缩小为 2 到 3 之间的数，并保持结果为 2。
            4. 最后一步，我们发现 2 的平方为 2 * 2 = 4，小于 8。因此我们将搜索范围缩小为 3 到 3 之间的数，并保持结果为 2。

            因此，我们得出结论，8 的平方根取整数部分为 2。
        * */

    }

    public static void main(String[] args) {
        System.out.print(sqrt(625));
    }
}
