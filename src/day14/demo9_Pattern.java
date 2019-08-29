package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo9_Pattern {
    public  static void main(String args[]) {
        String s = "我的手机号码是18387119283，以前用的是15887192757，还可以用13888654894";
        String regex = "1[853]\\d{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            System.out.println(m.group());
    }
}
