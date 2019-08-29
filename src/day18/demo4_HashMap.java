package day18;

import day18.user_definded.student;

import java.util.HashMap;

public class demo4_HashMap {
    public static void main(String[] args) {
        HashMap<student,String> map = new HashMap<>();
        map.put(new student("张三",21),"北京");
        map.put(new student("张三",21),"上海");   //要想覆盖北京，必须重写equals方法和hashcode方法
        map.put(new student("王五",32),"广州");
        map.put(new student("赵六",56),"深圳");
        System.out.println(map);
    }
}
