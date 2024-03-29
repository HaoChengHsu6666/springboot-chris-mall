package com.chrishsu.springbootchrismall.constant;

public class MyTest {

    public static void main(String[] args) {
        ProductCategory category = ProductCategory.TEA;
        String s = category.name();
        System.out.println(s);

        String s2 = "COOKIE";
        ProductCategory category2 = ProductCategory.valueOf(s2);
    }
}
