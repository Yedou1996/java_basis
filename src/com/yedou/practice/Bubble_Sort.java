package com.yedou.practice;

public class Bubble_Sort {
    public static void main(String args[]) {
        int arr [] ={3,9,4,3,8};
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }

    }
}
class student{
    private String name;
    private int age;
}
