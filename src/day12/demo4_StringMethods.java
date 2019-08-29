package day12;

public class demo4_StringMethods {
    public static void main(String args[]) {
        String s1="哈哈";
        String s2="哈哈";
        String s3="哈哈哈";
        String s4="我喜欢吃东西，哈哈";
        String s5="";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s4.contains(s1));//判断是否包含某个字符串
        System.out.println(s3.startsWith("哈"));//判断是否以“哈”开头
        System.out.println(s4.endsWith("哈"));//判断是否以“哈”结尾
        System.out.println(s5.isEmpty());//判断是否为空
    }
}
