package day18;

import day18.user_definded.student;

import java.util.Comparator;
import java.util.TreeMap;

public class demo6_treeMap {
    public static void main(String[] args) {
       // demo1();   //实现comparable方法来比较
        TreeMap<student,String> tm = new TreeMap<>(new Comparator<student>() {     //比较器
            @Override
            public int compare(student o1, student o2) {
                int num = o1.getName().compareTo(o2.getName()); //按照姓名比较
                return num == 0 ? o1.getAge() - o2.getAge() : num;
            }
        });
        tm.put(new student("张三",21),"上海");
        tm.put(new student("李四",21),"北京");
        tm.put(new student("王五",32),"深圳");
        tm.put(new student("赵六",45),"昆明");
        System.out.println(tm);

    }

    public static void demo1() {
        TreeMap<student,String> tm = new TreeMap<>();
        tm.put(new student("张三",21),"上海");
        tm.put(new student("李四",21),"北京");
        tm.put(new student("王五",32),"深圳");
        tm.put(new student("赵六",45),"昆明");
        System.out.println(tm);
    }
}
