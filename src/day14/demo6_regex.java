package day14;

public class demo6_regex {
    public static void main(String args[]) {
        String regex = "(.)\\1(.)\\2";     // \\1代表第一组又出现一次，\\2代表第二组又出现一次
        System.out.println("高高兴兴".matches(regex));

        String regex2 = "(..)\\1";   //任意两个字符再出现一次
        System.out.println("大哥大哥".matches(regex2));    //mathches :火柴
    }
}
