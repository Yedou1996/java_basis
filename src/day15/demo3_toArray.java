package day15;

import java.util.ArrayList;
import java.util.Collection;

public class demo3_toArray {
    public static void main(String[] args) {
        //把集合转换成数组可以实现集合的遍历
        demo_toArray();
        Collection c = new ArrayList();
        c.add(new student("张三",21));
        c.add(new student("李四",22));
        c.add(new student("王五",23));
        c.add(new student("赵六",24));
        Object arr [] = c.toArray();
        for (int i = 0; i <arr.length ; i++) {
            student s = (student)arr[i];    //向下转型
            System.out.println(s.getName()+"..."+s.getAge());
//            System.out.println(arr[i]);
        }

    }

    public static void demo_toArray() {
        Collection c =new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        Object arr[] = c.toArray();    //将集合转换为数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
