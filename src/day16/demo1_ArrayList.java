package day16;

import java.util.ArrayList;
import java.util.Iterator;

public class demo1_ArrayList {
    public static void main(String[] args) {      //去除一个集合中的重复元素
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("v");
        list.add("a");

        ArrayList newList = getSingle(list);
        System.out.println(newList);

    }
    public static ArrayList getSingle(ArrayList list) {
        ArrayList newList = new ArrayList();     //先创建一个集合用于存储不重复的元素
        Iterator it =list.iterator();    //迭代器用于老鼠组的迭代
        while (it.hasNext()) {
            Object obj = it.next();     //  创建一个变量用于存储迭代出来的元素
            if (!newList.contains(obj)){    //判断新创建的集合是否包含该元素
                newList.add(obj);      //不包含的话就添加进新集合
            }
        }
        return newList;
    }
}
