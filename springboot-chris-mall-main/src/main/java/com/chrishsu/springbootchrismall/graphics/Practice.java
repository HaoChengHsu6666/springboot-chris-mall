package com.chrishsu.springbootchrismall.graphics;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Practice {
    public static boolean xyzMiddle(String str) {
        int right = str.length() / 2 - 1;
        int left = str.length() / 2 - 2;
        if (str.length() < 3) {
            return false;
        }
        if (str.length() % 2 == 0) {
            return str.substring(right, right + 3).equals("xyz") ||
                    str.substring(left, left + 3).equals("xyz");
        } else if (str.length() % 2 == 1) {
            return str.substring(right, right + 3).equals("xyz");
        }
        return false;
    }

    public static void main(String[] args) {


//        Practice practice = new Practice();
//        int[] haha = {1, 5};
//        int[] gg = {3, 2};
//        Map<String, String> map1 = new HashMap<String, String>();
//        map1.put("a", "aaa");
//        map1.put("b", "bb");
//        map1.put("c","");
        String tag = "xyz";
        String tag2 = "abc";
//        String word = "2";
//        int n = 2;
        int nn[] = {1, 3, 4, 2, 4};
        int mm[] = new int[]{7, 8, 6, 4};
//        for (int i = 0; i < nn.length; i++) {
//            System.out.print(nn[i]);
//            if (i == nn.length - 1) {
//                continue;
//            }
//        }
        System.out.print(xyzMiddle(tag));
//        System.out.println(Arrays.binarySearch(nn, 7));
//        System.out.println(Arrays.binarySearch(nn, 8));
//        System.out.println(Arrays.binarySearch(nn, 6));
//        System.out.println(Arrays.binarySearch(nn, 4));
//        System.out.println(Arrays.binarySearch(nn, 5));
//        System.out.println(Arrays.binarySearch(nn, 1));
//        System.out.println(Arrays.binarySearch(nn, 9));
//        System.out.println(bigDiff(nn));


//        System.out.println("1");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println("4");
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println("2");
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 4; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println("3");
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 5; k > i; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//
//        for (int i = 0; i <= 7; i++) {
//            for (int k = 0; k < i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 15; j >= 1 + i * 2; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= 7; i++) {
//            for (int j = 7; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 1 + i * 2; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //第一象限直角三角型
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        //or
//        for(int i=1;i<=9;i++){
//            for(int j=9;j>=i;j--){
//                System.out.print("");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
        //第二象限直角三角形
//        for(int i=1;i<=9;i++){
//            for (int j=9;j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //第三象限直角三角形
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int k=9;k>=i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //第四象限直角三角形
//        for (int i=9;i>=0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //or
//        for(int i=1;i<=9;i++){
//            for(int j=9;j>=i;j--){
//                System.out.print("*");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        //實心等腰三角形
//        for(int i=1;i<=9;i++){
//            for(int j=9;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //空心等腰三角形
//        for (int i = 0; i <= 4; i++) {
//            for (int j = 1; j <= 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i + 1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //空心圓形
//        double r = 10;
//        double R = 2*r;
//        for(int i = 0;i <= R;i+=2) {
//            double y;
//            if(i <= r)  y = r-i;
//            else y = i-r;
//            double len =  Math.round(Math.sqrt(r*r - y*y));
//            for(int j = 0;j < r-len;j++)  System.out.print(" ");
//            System.out.print("*");
//            for(int j = 0;j < 2*len;j++)  System.out.print(" ");
//            System.out.println("*");
//        }
        //菱形
//        for(int i=0;i<8;i++){
//            for(int j=7;j>i;j--){
//                System.out.print("_");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int k=0;k<=8;k++){
//            for(int l=0;l<=k;l++){
//                System.out.print("_");
//            }
//            for(int m=14;m>k*2+1;m--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        private static void rightBottomAngleRecur(int row) {
//            for (int r = 1; r <= row; r++) System.out.print("*");
//            System.out.println();
//            if (row > 0) rightBottomAngleRecur(row - 1);
//        }

    }
}
