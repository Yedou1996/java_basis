package day17;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class demo5_test2 {    //键盘录入一个字符串去除重复元素并打印
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串");
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        String s2 = s.nextLine();
        char[] s3  =s2.toCharArray();   //将字符串转换为字符数组
        for (char i:s3
             ) {
            hs.add(i);
        }
        for (char i:hs
             ) {
            System.out.print(i);
        }


    }
}
