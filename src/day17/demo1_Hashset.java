package day17;

import java.util.HashSet;

public class demo1_Hashset {
    public static void main(String[] args) {
        HashSet<String>  hs = new HashSet<>();  //特点：无索引，不能用get方法，不可以重复，无序
        hs.add("a");
        hs.add("b");
        hs.add("c");
        for (String string:hs
             ) {
            System.out.println(string);
        }
    }
}
