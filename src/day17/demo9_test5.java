package day17;




import java.util.Comparator;
import java.util.Scanner;

import java.util.TreeSet;

public class demo9_test5 {
    public static void main(String[] args) {   //键盘录入一个字符串，用集合排序输出
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 =s.nextLine();
        char [] arr = s1.toCharArray();
        TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

            @Override
            public int compare(Character c1, Character c2) {
                int num = c1.compareTo(c2);
                return num == 0 ? 1:num;
            }
        });
        for (Character i:arr    //遍历字符数组存入TreeSet
             ) {
            ts.add(i);
        }
        for (Character i:ts   //遍历TreeSet集合
             ) {
            System.out.print(i);
        }
    }
}
