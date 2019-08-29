package com.yedou.Class_Static_rectangle;

public class Demo_ArrayTool {
    public static void main(String[] args){
//        ArrayTool a=new ArrayTool();
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        ArrayTool.print(arr);
        System.out.println();
        System.out.println("__________________");
        int max= ArrayTool.getMax(arr);
        System.out.println(max);
        ArrayTool.reverseArray(arr);
        ArrayTool.print(arr);
    }
}
