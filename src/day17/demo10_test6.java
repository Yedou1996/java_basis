package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class demo10_test6 {
    public static void main(String[] args) {    //键盘录入整数倒序排列，quit退出
        Scanner s = new Scanner(System.in);
        System.out.println("请输入整数，输入quit退出:");
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num = o2.compareTo(o1);  //倒序排列
                return num == 0 ? 1:num;
            }
        });
        while (true){
            String s2 = s.nextLine();      //无限循环体，直到输入“quit”
            if ("quit".equals(s2)){
                break;
            }
            try {
                Integer i = Integer.parseInt(s2);   //将字符串转换为int的包装类
                ts.add(i);
            }catch (Exception e) {
                System.out.println("录入错误，请您输入整数：");
            }

        }
        for (Integer i:ts
             ) {
            System.out.println(i);
        }

    }
}
