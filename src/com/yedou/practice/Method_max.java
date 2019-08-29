package com.yedou.practice;
import java.util.Scanner;
public class Method_max {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=d.nextInt();
        System.out.println("请输入第二个数");
        int b=d.nextInt();
        int maxx=max(a,b);
        System.out.println(maxx);
        boolean sum=equality(a,b);
        System.out.println(sum);
    }
    public static int max(int a,int b) {
         int max_num=(a>b) ? a : b;
         return max_num;
    }
    public static boolean equality(int a,int b) {
        boolean sum=a==b ? true:false;
        return sum;
    }
}
