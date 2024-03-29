package com.chrishsu.springbootchrismall.practice;

/*
*
* Question：
* 給兩個字串 string和needle，請你在string字串中找出needle字串的第一個符合項目的下標（下標從0 開始）。
* 如果 needle不是string的一部分，則傳回  -1 ，EX：輸入： string = "sadbutsad", needle = "sad"
*
*   輸出： 0
    解釋： "sad" 在下標0 和6 處匹配。
    第一個符合項的下標是0 ，所以回傳0 。

    輸入： string = "leetcode", needle = "leeto"
    輸出： -1
    解釋： "leeto" 沒有在"leetcode" 中出現，所以回傳-1 。
*
* Ans：
* 在這個範例中，我們使用兩層循環來比較string中的每個可能的子字串是否與needle相符。
* 外層循環遍歷string字串中的每個可能的起始位置，內層循環則用來檢查從該起始位置開始的子字串是否與needle完全匹配。
* 如果找到完全匹配的子字串，則傳回該子字串的起始索引；如果內層循環結束後沒有找到匹配的子字串，則繼續遍歷下一個可能的起始位置。
*/

public class FirstMatchString {
    public static int matchCount(String string,String needle){

        int sl = string.length();
        int nl = needle.length();

        if (needle.isEmpty()) {
            return 0; // 如果needle是空字串，返回0
        }

        for (int i = 0; i <= sl - nl; i++) {
            int j;
            for (j = 0; j < nl; j++) {
                if (string.charAt(i + j) != needle.charAt(j)) {
                    break; // 如果当前字符不匹配，跳出内层循环
                }
            }
            if (j == nl) {
                return i; // 如果内层循环完全匹配，返回匹配的起始索引
            }
        }

        return -1; // 没有找到匹配的子串，返回-1

        // 若直接使用 String API 同樣可解決
        // return string.indexOf(needle);

    }

    public static void main(String[] args) {
        System.out.println(matchCount("Ifeelsadness","sad"));
    }
}
