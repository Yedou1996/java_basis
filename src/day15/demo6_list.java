package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo6_list {
    public static void main(String[] args) {
//        demo1();
//        demo2_remove();
//        demo3_removeInter();
//        demo4_getList();
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.set(1,"f");
        System.out.println(list);   //指定索引位置插入元素
    }

    public static void demo4_getList() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        for (int i = 0; i <list.size() ; i++) {      //通过get方法遍历list，是list独有的遍历方法
//            System.out.println(list.get(i));
//        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());    //通过迭代器遍历list
        }
    }

    public static void demo3_removeInter() {
        List list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        list.remove(111); //删除的时候不会自动装箱，会当做索引
        System.out.println(list);
    }

    public static void demo2_remove() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list.remove(1));     //通过索引删除元素，将被删除的元素返回
        System.out.println(list);
    }

    public static void demo1() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.add(1,"e");   //指定索引位置添加元素
        System.out.println(list);
        list.add(5,"f");   //索引位置必须小于等于集合的长度。否则IndexOutBoundException(索引越界异常)
        System.out.println(list);
    }
}
