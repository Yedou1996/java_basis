package com.yedou;
import java.util.Scanner;
public class Scanner_text3 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a1=a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.println("请输入第二个数：");
        int b1=b.nextInt();
        Scanner c=new Scanner(System.in);
        System.out.println("请输入第三个数：");
        int c1=c.nextInt();
        int max;
        if(a1 > b1 && b1>c1) {
            max=a1;
        }else if (b1 >c1 && b1>a1) {
            max=b1;
        }else {
            max=c1;
        }
        System.out.println(max);
    }
}
