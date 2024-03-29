package com.chrishsu.springbootchrismall.practice;

public class LengthOfLastWord {
    public static int lengthOfLastWord (String s){
        int lastword = 0;
        int sl = s.length();
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' ' && lastword == 0){
                continue;
            }
            if(s.charAt(i) == ' '){
                return lastword;
            }
            lastword++;
        }
        return lastword;
    }

    public static void main(String[] args) {
        System.out.print(lengthOfLastWord("I love my job, and also programming!  "));
    }
}
