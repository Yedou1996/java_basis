package day18;

import java.util.ArrayList;
import java.util.Collections;

public class demo10_Collections {
    // collections中常见的方法
    public static void main(String[] args) {
        //demo1();  //排序sort
        //demo2();   //binarySearch ,二分查找
        demo3();   //获取最大值  max   反转  reverse   随机置换 shuffle


    }

    public static void demo3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(Collections.max(list));  //根据默认排序结果获取最大值
        Collections.reverse(list);    //反转
        System.out.println(list);
        Collections.shuffle(list);   //随机置换，可以用来洗牌
        System.out.println(list);     //随机置换， 模拟洗牌。
    }

    public static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(Collections.binarySearch(list,"a"));   //返回索引
        System.out.println(Collections.binarySearch(list,"e"));   //负的插入点减一
    }

    public static void demo1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        Collections.sort(list);       //排序的方法
        System.out.println(list);
    }
}
