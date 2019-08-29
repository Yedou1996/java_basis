package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class demo8_test4 {
    public static void main(String[] args) {     //创建一个集合排序不去除重复
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("dd");
        list.add("cc");
        list.add("bb");
        list.add("aa");
        Sort(list);
        System.out.println(list);
    }

    public static void Sort(List<String> list) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {        //比较器，匿名内部类


            @Override
            public int compare(String s1, String s2) {    //重写compare方法
                int num = s1.compareTo(s2);
                return num == 0 ? 1 : num;       //不去除重复
            }
        });
        ts.addAll(list);
        list.clear();
        list.addAll(ts);
    }
}
