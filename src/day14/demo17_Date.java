package day14;

import java.util.Date;

public class demo17_Date {
    public static void main(String args[]) {
//        Date d1 = new Date();
//        System.out.println(d1);  //打印当前时间
//
//        Date d2 = new Date(0);   //打印1970年1月1日
//        System.out.println(d2);


//        Date d1 = new Date();
//        System.out.println(d1.getTime());  //通过对象获取当前时间毫秒
//        System.out.println(System.currentTimeMillis());  //通过System.currentTimeMillis获取当前时间毫秒

        Date d3 = new Date();
        d3.setTime(1000);   //设置毫秒值，改变时间对象  一秒等于1000毫秒
        System.out.println(d3);

    }
}
