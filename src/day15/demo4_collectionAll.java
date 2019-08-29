package day15;

import java.util.ArrayList;
import java.util.Collection;

public class demo4_collectionAll {
    public static void main(String[] args) {
        demo1_remove();
        Collection c =new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        boolean b =  c.retainAll(c2);  //取交集，如果调用的集合改变就返回true，如果调用的集合不改变就返回false
        System.out.println(b);
        System.out.println(c);
    }

    public static void demo1_remove() {
        Collection c =new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");

        c.addAll(c2);    // 复制c2的数据到c
        System.out.println(c);
        boolean b =c.removeAll(c2);    // 删除两个集合的交集
        boolean b2 = c.containsAll(c2);  //判断调用的集合是否包含传入的集合
        System.out.println(b);
        System.out.println(b2);
        System.out.println(c);
    }
}
