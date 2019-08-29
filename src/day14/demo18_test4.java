package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo18_test4 {
    public static void main(String args[]) throws ParseException {
        String birthday = "1996年12月10日";
        String today = "2019年2月15日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d = sdf.parse(birthday);
        Date d2 = sdf.parse(today);
        long time = d2.getTime()- d.getTime();
        System.out.println(time/1000/60/60/24/365);
    }
}
