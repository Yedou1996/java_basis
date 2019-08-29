package day16;

import java.util.LinkedList;

public class demo4_LinkedList {
    public static void main(String[] args) {
//        demo1();
        Stack s =new Stack();
        s.in("a");
        s.in("b");
        s.in("c");
        s.in("d");
        while (!s.isEmpty()){
            System.out.println(s.out());
        }
    }

    public static void demo1() {
        LinkedList list = new LinkedList();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");

        while (!list.isEmpty()) {
            System.out.println(list.removeLast());
        }
    }
}
