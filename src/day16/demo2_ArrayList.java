package day16;

import day16.user_defined.person;

import java.util.ArrayList;
import java.util.Iterator;

public class demo2_ArrayList {
    public static void main(String[] args) {   //自定义对象去重复记得要重写equals方法和toString方法，remove也需要
        ArrayList list = new ArrayList();
        list.add(new person("张三",23));
        list.add(new person("张三",23));
        list.add(new person("张三",23));
        list.add(new person("李四",56));
        list.add(new person("李四",56));
        list.add(new person("李四",56));
//        ArrayList newlist = getSingle(list);
//        System.out.println(newlist);
        list.remove(new person("张三",23));   //remove方法底层依赖的也是equals方法，也需要重写equals方法来比较他们的属性值
        System.out.println(list);
    }
    public static ArrayList getSingle(ArrayList list) {
        ArrayList newList = new ArrayList();     //先创建一个集合用于存储不重复的元素
        Iterator it =list.iterator();    //迭代器用于老数组的迭代
        while (it.hasNext()) {
            Object obj = it.next();     //  创建一个变量用于存储迭代出来的元素
            if (!newList.contains(obj)){    //判断新创建的集合是否包含该元素   ，contains方法底层是依赖equals方法
                newList.add(obj);      //不包含的话就添加进新集合
            }
        }
        return newList;
    }

}
