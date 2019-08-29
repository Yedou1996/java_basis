package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo5_Iterator {
    public static void main(String[] args) {
//        demo1();
        Collection c = new ArrayList();
        c.add(new student("张三",21));
        c.add(new student("李四",22));
        c.add(new student("王五",23));
        c.add(new student("赵六",24));
        Iterator it = c.iterator();
        while (it.hasNext()){
            student s =(student)it.next();      //向下转型
            System.out.println(s.getName()+"...."+s.getAge());
        }
    }

    public static void demo1() {
        Collection c =new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Iterator it = c.iterator();
//        boolean b = it.hasNext();     //判断是否有元素
//        Object obj = it.next();       //返回该元素
//        System.out.println(b);
//        System.out.println(obj);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
