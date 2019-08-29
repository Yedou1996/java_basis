package day16;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo11_aslist {
    public static void main(String[] args) {
        //demo1();   字符串数组转集合
        //demo2();   //基本数据类型转集合
        ArrayList<String> list = new ArrayList<>();
        list.add("23");
        list.add("56");
        list.add("heh ");
        list.add("67");
        list.add("23");
        String arr [] =list.toArray(new String[1]);   //集合转数组
        for (String i:arr
             ) {
            System.out.println(i);
        }
    }

    public static void demo2() {
        //        int arr [] = {11,232,1,23,123,};
//        List<int []> list=Arrays.asList(arr);  //基本数据类型的数组转成集合，会将整个数组当成一个对象。
//        System.out.println(list);
        Integer [] arr = {11,213,23,123};
        List<Integer> list = Arrays.asList(arr);   //用Integer来存储数组可以打印完整
        System.out.println(list);
    }

    public static void demo1() {
        String arr [] = {"a","b","c"};
        List<String> list = Arrays.asList(arr);   //数组转集合，不能进行增加或者减少元素，但是可以使用集合其他的方法
        System.out.println(list);
    }
}
