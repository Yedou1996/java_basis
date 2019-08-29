package day16;

import day16.user_defined.person;

import java.util.ArrayList;
import java.util.Iterator;

public class demo5_Generic {
    public static void main(String[] args) {
        ArrayList<person> list = new ArrayList<>();  //后面泛型可不写，1.7版本的新特性
//        list.add("a");                            //泛型的好处：提高安全性（将运行的错误转换到编译期），省去强转的麻烦
//        list.add(true);                              <>里面放的必须是引用数据类型，前后泛型类型必须一致
                                                    //泛型定义成Object没有意义
        list.add(new person("张三",21));
        list.add(new person("李四",22));

        Iterator<person> it = list.iterator();
        while (it.hasNext()) {
            person p =it.next();
            System.out.println(p.getAge()+"....."+p.getName());
        }

    }
}
