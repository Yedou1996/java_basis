package com.yedou;

import java.util.Scanner;

public class Scanner_text {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int b=a.nextInt();
        System.out.println("请输入第二个整数");
        int c=a.nextInt();
        System.out.println("两数的和为"+(b+c));
        int temp=(b>c)? b : c ;
        System.out.println("两数中最大的数是"+temp);
    }
}
