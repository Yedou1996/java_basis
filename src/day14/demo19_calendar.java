package day14;

import java.util.Calendar;

public class demo19_calendar {
    public static void main(String args[]) {
        Calendar c = Calendar.getInstance();   //父类引用指向子类对象
        c.add(Calendar.MONTH,-1);   //对指定的字段进行向前减或向后加
        c.set(Calendar.YEAR,2000);         //修改指定的字段
        c.set(2000,5,6);    //修改指定的日期为2000年6月6日



        System.out.println(c.get(Calendar.YEAR));   //获取年
        System.out.println(c.get(Calendar.MONTH));   //获取月，但是是从0开始的
        System.out.println(c.get(Calendar.DAY_OF_MONTH));  //月中的第几天
        System.out.println(c.get(Calendar.DAY_OF_WEEK));   //周日是第一天，周六是最后一天

        System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK)));
        System.out.println(getNum(c.get(Calendar.MONTH)+1));
    }
    public static String getWeek(int week) {
        String []  arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[week];
    }
    public static String getNum (int num) {
        return num>9 ? ""+num : "0"+num;
    }
}
