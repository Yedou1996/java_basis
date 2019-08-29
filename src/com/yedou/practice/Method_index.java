package com.yedou.practice;

public class Method_index {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,5,34,34,34,3,4,23,2343};
        int index=getIndex(arr,7);
        System.out.println(index);
    }
    public static int getIndex(int[] arr,int value) {
        for (int i=0;i<arr.length;i++) {
           if (arr[i]==value) {
               return i;
           }
        }
        return -1;
    }
}
