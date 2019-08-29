package day16;

import day16.user_defined.person;

import java.util.ArrayList;
import java.util.Iterator;

public class demo8_foreach {
    public static void main(String[] args) {
        //demo1();   //增强for循环遍历数组
        //demo2(); //  增强for循环遍历引用数据类型
        //demo3();  //普通for循环删除
        //demo4();   //  迭代器删除
        //增强for循环不能删除，只能遍历，因为他底层用的是迭代器，删除用的是集合的remove，会报并发修改异常
    }

    public static void demo4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if ("b".equals(it.next())){
                //list.remove("b"); //不能这样删除，会出现并发修改异常
                it.remove();
            }
        }
        System.out.println(list);
    }

    public static void demo3() {
        ArrayList<String> list = new ArrayList<>();     //普通的for循环的删除，注意索引要--
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        for (int i = 0; i<list.size();i++) {
            if ("b".equals(list.get(i))){
                list.remove(i--);    //这里不加--的话会相邻的相同元素不会被删除，因为删除后向前移动自动补齐。。。
            }
        }
        System.out.println(list);
    }

    public static void demo2() {
        ArrayList<person> list =new ArrayList<>();       //增强for循环遍历引用数据类型
        list.add(new person("张三",23));
        list.add(new person("张yi",23));
        list.add(new person("张we",23));
        list.add(new person("张aa",23));
        for (person i:list
             ) {
            System.out.println(i);
        }
    }

    public static void demo1() {
        int [] arr = {11,34,23,4,1,22,32,};   //增强for循环
        for (int i : arr                           //遍历数组
             ) {
            System.out.println(i);
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");                 //遍历集合，底层使用迭代器
        for (String i: list
             ) {
            System.out.println(i);
        }
    }
}
