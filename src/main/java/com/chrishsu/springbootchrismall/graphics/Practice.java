package com.chrishsu.springbootchrismall.graphics;

public class Practice {
    public static void main(String[] args) {

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
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int k=0;k<=8;k++){
//            for(int l=0;l<=k;l++){
//                System.out.print(" ");
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
