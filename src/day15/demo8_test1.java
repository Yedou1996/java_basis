package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class demo8_test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("world");
        list.add("c");
        list.add("d");
//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            String str = (String)it.next();    //ConcurrentModificationException 并发修改异常
//            if ("world".equals(str)){
//                list.add("javaEE");
//            }
//        }
        ListIterator lit =list.listIterator();   //list集合特有的迭代器
        while (lit.hasNext()) {
            String str = (String)lit.next();
            if ("world".equals(str)) {
                //list.add("javaEE");   //调用这个还是会发生并发修改异常
                lit.add("javaEE");
            }
        }
        System.out.println(list);

    }
}
