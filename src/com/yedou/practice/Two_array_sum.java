package com.yedou.practice;

public class Two_array_sum {
    public static void main(String[] args) {
        int[][] arr=new int[][] {{22,66,44},{77,33,88},{25,35,65},{11,66,99}};
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
