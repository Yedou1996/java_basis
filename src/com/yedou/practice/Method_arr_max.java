package com.yedou.practice;

public class Method_arr_max {
    public static void main(String[] args) {
            int [] arr=new int[] {1,32,42,4,123,412,312,1,213,21,3};
          int max= max(arr);
          System.out.println(max);
    }
    private static int max(int [] arr) {
        int max=arr[0];
        for (int i=1;i<arr.length;i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
}
