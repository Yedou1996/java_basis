package day15;


import java.util.ArrayList;
import java.util.Collection;

public class demo2_collectionArrayList {
    public static void main(String[] args) {
//        demo1_add();
        Collection c =new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
         c.add("d");
        c.remove("b");    //删除指定元素
        System.out.println(c);
        System.out.println(c.contains("a"));  //判断是否包含
        System.out.println(c.isEmpty());    //判断是否为空
        c.clear();   //清空集合
        System.out.println(c);

    }
    public static void demo1_add() {
        Collection c =  new ArrayList();   //父类引用指向子类对象
        boolean b1 = c.add("abc");
        boolean b2 = c.add(true);    // 自动装箱  new Boolean（true）
        boolean b3 = c.add(100);
        boolean b4 = c.add(new student("张思",22));
        boolean b5 = c.add("abc");
        System.out.println(b1);       //add方法如果是List集合一直都返回true，因为List集合一直返回true，
        System.out.println(b2);       //如果是Set集合当存储重复元素时就会返回false
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(c);     //ArrayList父类的父类重写了toString方法
    }
}
