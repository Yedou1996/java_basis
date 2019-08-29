package day14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo18_simpleDateFormat {
    public static void main(String args[]) throws ParseException {
//        DateFormat  抽象类，不能被实例化
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(); //创建日期格式化对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(d);
        System.out.println(sdf.format(d));
        System.out.println(sdf2.format(d));   //将日期对象转换为字符串

        String s = "2019年2月14日 20:22";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
         d=sdf3.parse(s);                       //抛异常快捷键： alt+enter
        System.out.println(d);
    }
}
