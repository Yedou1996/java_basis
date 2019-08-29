package com.yedou.practice;

public class control_language {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            if(i%3==0) {
                //break; 输出两次
                //continue; 输出7次
                System.out.println("hello world"); //输出13次
            }
            System.out.println("hello world");
        }
    }
}
