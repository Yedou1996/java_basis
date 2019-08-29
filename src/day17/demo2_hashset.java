package day17;

import day16.user_defined.person;

import java.util.HashSet;

public class demo2_hashset {
    public static void main(String[] args) {
        HashSet<person> hs = new HashSet<>();
        hs.add(new person("张三",21));
        hs.add(new person("张三",21));
        hs.add(new person("张三",21));
        hs.add(new person("李四",22));
        hs.add(new person("李四",22));
        hs.add(new person("李四",22));
        System.out.println(hs);
    }
}
