package com.yedou;
import java.util.Scanner;
public class Scanner_text2 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int b=a.nextInt();
        System.out.println("请输入第二个整数");
        int c=a.nextInt();
        boolean temp=(b==c)? true:false;
        System.out.println("两个数相等？"+temp);

        System.out.println("请输入第三个整数");
        int d=a.nextInt();
        int e=(b > c)? b : c;
        int f=(e > d)? e : d;
        System.out.println("最大数的值是"+ f);
    }
}
