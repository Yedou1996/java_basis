package com.yedou;

public class narcissistic_number {

   public static void main(String[] args) {
       int count=0;
       for (int i = 100;i<=999;i++) {
           int a=i%10;
           int b=i/10%10;
           int c=i/100%10;
           if(a*a*a+b*b*b+c*c*c==i) {
               count ++;
               System.out.println(i);
           }
       }
       System.out.println("三位数的水仙花数的个数为"+count+"个");


   }
}
