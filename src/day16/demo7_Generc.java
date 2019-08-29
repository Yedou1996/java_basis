package day16;

import day16.user_defined.person;
import day16.user_defined.stundet;

import java.util.ArrayList;


public class demo7_Generc {
    public static void main(String[] args) {
       ArrayList<person> list =new ArrayList<>();
       list.add(new person("小李",23));
       list.add(new person("校长",21));
       ArrayList<stundet> list1 = new ArrayList<>();
       list1.add(new stundet("张三",34));

       list.addAll(list1);
        System.out.println(list);
      // list1.addAll(list);    只能把子类添加到父类
    }
}
