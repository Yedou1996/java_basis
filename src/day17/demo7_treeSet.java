package day17;



import day17.user_definded.person;

import java.util.TreeSet;

public class demo7_treeSet {
    public static void main(String[] args) {
        //demo1();
        TreeSet<person> ts = new TreeSet<>();
        ts.add(new person("张三", 23));
        ts.add(new person("李四", 13));
        ts.add(new person("王五", 33));
        ts.add(new person("立马自", 43));
        ts.add(new person("大王", 53));

        System.out.println(ts);
    }

    public static void demo1() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);    //也可以保证元素唯一性，可以用来排序
        ts.add(2);
        ts.add(3);
        ts.add(1);
        System.out.println(ts);
    }
}
