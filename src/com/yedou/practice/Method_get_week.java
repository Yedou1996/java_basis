package com.yedou.practice;
import java.util.Scanner;
public class Method_get_week {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入数字");
        int b=a.nextInt();
            System.out.println("星期："+getweek(b));
    }
    public static char getweek(int week) {
        char [] arr={' ','一','二','三','四','五','六','日'};
        return arr[week];
    }
}
