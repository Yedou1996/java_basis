package com.yedou.practice;
import java.util.Scanner;
public class Method_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入行数：");
        int a=sc.nextInt();
        System.out.println("请输入列数：");
        int b=sc.nextInt();
        print(a,b);
    }
    public static void print(int a,int b) {
        for(int i=1;i<=a;i++) {
            for (int j=1;j<=b;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }
}
