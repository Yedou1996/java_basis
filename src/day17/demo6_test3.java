package day17;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class demo6_test3 {   //去除一个集合中的重复元素
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("d");
        list.add("d");
        getSingle(list);
        System.out.println(list);
    }

    private static void getSingle(List<String> list) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);
        list.clear();
        list.addAll(lhs);
    }
}
