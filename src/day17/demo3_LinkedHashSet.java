package day17;

import java.util.LinkedHashSet;

public class demo3_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();  //保证唯一性（hashSet的子类）和怎么存就怎么取，有序，底层是链表实现的
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");
        System.out.println(lhs);
    }
}
