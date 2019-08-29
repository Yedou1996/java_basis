package day16;

import java.util.LinkedList;

public class demo3_LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");  //从头添加
        list.addFirst("c");
        list.addFirst("d");
        list.addLast("b");   //从尾添加
        list.removeFirst();   //移除第一个
        list.removeLast();
        list.get(1);    //根据索引查找，链表不能根据索引查找，它底层实现的方法其实是判断索引区间，在遍历一个一个对比
        list.getFirst();
        list.getLast();

    }
}
