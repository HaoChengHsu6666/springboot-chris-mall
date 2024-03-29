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
            return ""; // 字符串数组为空，返回空字符串
        }

        String publicPrefix = "";

        int sl = strs.length;

        // GPT寫法
        String prefix = strs[0]; // 初始化前缀为第一个字符串
        for (int i = 1; i < sl; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // 不断缩小前缀直到匹配为止
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    // 如果前缀为空，说明不存在公共前缀，直接返回空字符串
                    return "";
                }
            }
        }

        // 我的寫法，仍有誤。
//        for (int i = 0; i < sl-1; i++){
//            if(!publicPrefix.isEmpty() &&
//                    strs[i].toLowerCase().substring(0,publicPrefix.length())
//                    .equals(publicPrefix)){
//                break;
//            }
//            int k = 0;
//            for(int j = i+1; j < sl; j++){
//                if(strs[i].charAt(k) == strs[j].charAt(k)){
//                    publicPrefix = publicPrefix + strs[i].charAt(k);
//                }
//                k++;
//            }
//        }
//        return publicPrefix;
          return prefix;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"goodjob","gooddog","goodman"};
        System.out.print(findPublicPrefix(words));

    }

}
