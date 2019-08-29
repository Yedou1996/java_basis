package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import day17.user_definded.student;

public class demo11_test7 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("请输入学生成绩格式是：姓名，语文成绩，数学成绩，英语成绩");
        TreeSet<student> ts = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                int sum = o1.getSum() - o2.getSum();
                return sum == 0 ? 1 : sum;
            }
        });

        while (ts.size()<2) {
            String s1 = s.nextLine();
            String arr [] =s1.split(",");
            int chinese = Integer.parseInt(arr[1]);
            int math = Integer.parseInt(arr[2]);
            int english = Integer.parseInt(arr[3]);
            ts.add(new student(arr[0],chinese,math,english));
        }
        for (student i:ts
             ) {
            System.out.println(i);
        }
    }
}
