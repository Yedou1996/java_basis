package com.yedou.practice;

public class Method_reverse {
    public static void main(String[] args) {
    int [] arr={3,4,6,2,7,5};
    reverse(arr);
    travers(arr);
    }
    public static void reverse(int [] arr) {   //反转数组
        for(int i=0;i<arr.length/2;i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void travers(int [] arr) {  //遍历数组
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}

