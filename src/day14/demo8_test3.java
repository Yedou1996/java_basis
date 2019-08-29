package day14;

public class demo8_test3 {
    public static void main(String args[]) {
        String s = "我。。。要。。要。。。。。要。。。。学。。。编程。。程。。。。程";
        String regex = "\\。+";
        String s1 = s.replaceAll(regex,"");
        System.out.println(s1);
        String regex2 = "(.)\\1+";
        String s2 = s1.replaceAll(regex2, "$1");
        System.out.println(s2);
    }
}
