/**
 这是一个数组工具类，封装查找数组最大值的方法，遍历数组的方法，反转数组的方法。
 方法全部静态，私有化空构造
 @auther LXL
 @version v1.0
 */

package com.yedou.Class_Static_rectangle;

 public class ArrayTool {
    /**
     私有构造方法
     */
    private ArrayTool(){}

    /**
     返回数组的最大值
     * @param  arr 接收一个int数组
     * @return  返回数组中最大值
     */
    public static int getMax(int [] arr) {   //返回数组的最大值
        int max=arr[0];
        for (int i=1;i<arr.length;i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    /**
     遍历数组
     * @param arr int数组
     */
    public static void print(int [] arr) {  //遍历数组
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    /**
     反转数组
     * @param arr int数组
     */
    public static void  reverseArray(int [] arr) {
        for (int i=0;i<arr.length/2;i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }

}
