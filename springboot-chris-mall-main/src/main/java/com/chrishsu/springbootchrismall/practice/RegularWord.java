package com.chrishsu.springbootchrismall.practice;

import java.util.HashMap;

/*
* Question：
* 給定一個規律pattern 和一個字串 s ，判斷s 是否遵循相同的規律。
* 這裡的 遵循 指完全匹配，例如，pattern 裡的每個字母和字串 s 中的
* 每個非空單字之間存在雙向連接的對應規律。
* EX1：輸入: pattern = "abba", s ="dog cat cat dog" 輸出: true
* EX2：輸入: pattern = "abba", s ="dog cat cat fish" 輸出: false
*
*
* Ans：
* 使用了一个HashMap来存储pattern字符到单词的映射关系。在每次遇到一个新的pattern字符时，
* 我们检查该字符是否已经在HashMap的key集合中，
* 如果是，则检查对应的单词是否正确；如果不是，则检查对应的单词是否已经在HashMap的value集合中，
* 如果是则返回false，否则将这个pattern字符和单词添加到HashMap中。
*
* 最初的实现中使用了两个HashMap是为了代码的清晰和易读性。
* 通过将pattern字符到单词的映射和单词到pattern字符的映射分别存储在两个HashMap中，
* 可以更容易地管理这些映射关系，并且使得代码结构更加清晰。
* 然而，你提出的问题让我重新审视了这个问题，
* 并意识到确实可以通过使用单个HashMap来简化代码而不影响功能。
* 这样做可以减少代码的复杂性，并且不会对性能造成实质性影响。
*
* */

public class RegularWord {

    public static boolean wordPattern (String pattern,String s){
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        // 雙HashMap寫法
//        for (int i = 0; i < pattern.length(); i++) {
//            char c = pattern.charAt(i);
//            String word = words[i];
//
//            if (map.containsKey(c)) {
//                if (!map.get(c).equals(word)) {
//                    return false;
//                }
//            } else {
//                map.put(c, word);
//            }
//
//            if (reverseMap.containsKey(word)) {
//                if (reverseMap.get(word) != c) {
//                    return false;
//                }
//            } else {
//                reverseMap.put(word, c);
//            }
//        }

        // 單HashMap寫法
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                // 預防性檢查，如Key檢查到已不同，但Value卻是已存在的，
                // 則已違反此例的Key-Value一對一原則，故回傳false
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(c, word);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("acca","cat dog dog cat"));
    }
}
