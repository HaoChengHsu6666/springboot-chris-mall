package com.chrishsu.springbootchrismall.practice;

/*
* Question：
* 編寫一個Java函數來尋找字串陣列中的最長共同前綴詞。

如果不存在公共前綴，則傳回空字串 ""。
* EX1：輸入： strs = ["flower","flow","flight"]
輸出： "fl" ，
* EX2：輸入： strs = ["dog","racecar","car"]
輸出： ""
*
*
* Ans：可以使用水平掃描法來解決這個問題。基本想法是，
* 從字串陣列中的第一個字串開始，逐個字元比較所有字串的相同位置，
* 直到找到不匹配的字元為止，然後返回找到的相同前綴。
* */


public class PublicPrefixWord {

    public static String findPublicPrefix(String[] strs){

        if (strs == null || strs.length == 0) {
            return "";
        }

        String publicPrefix = "";
        int sl = strs.length;
        String prefix = strs[0];
        for (int i = 1; i < sl; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"goodjob","gooddog","goodman"};
        System.out.print(findPublicPrefix(words));

    }

}


