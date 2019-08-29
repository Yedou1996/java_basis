package day15;

import java.util.ArrayList;
import java.util.List;

public class demo7_listStudent {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new student("张三",21));
        list.add(new student("李四",22));
        list.add(new student("王五",23));   //list集合存储引用数据类型
        list.add(new student("赵六",24));
        for (int i = 0; i <list.size() ; i++) {
            student s = (student)list.get(i);
            System.out.println(s.getName()+">>>>"+s.getAge());
        }

    }
}
