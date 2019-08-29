package day14;

import java.util.Calendar;
import java.util.Scanner;

public class demo20_test5 {

    public static void main(String args[]) {
        //键盘录入一个年份，判断是闰年还是平年
        //
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个年份，判断是闰年还是平年");
        String str = s.nextLine();
        int year = Integer.parseInt(str);   //将数字字符串转换为数字
        boolean b = getYear(year);         //快捷键 psvm（main方法）,fori(for循环)，sout（输出函数）
        System.out.println(b);
    }

    private static boolean getYear(int year) {
        Calendar  c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
            return c.get(Calendar.DAY_OF_MONTH) == 29 ;
    }
}
