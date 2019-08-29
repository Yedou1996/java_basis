package com.yedou.practice;

public class Method_arr_traverse {
    public static void main(String[] args) {
        int [] arr=new int[] {1,2,3,4,5};
        int[] arr1={3,45,54,6,4};
        print(arr);
        print(arr1);
    }
    public static void print(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
}
