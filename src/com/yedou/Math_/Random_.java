package com.yedou.Math_;

public class Random_ {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            System.out.println(Math.random());
        }

        for (int i=1;i<=10;i++) {
            System.out.println((int)(Math.random()*100)+1);
        }
    }
}
