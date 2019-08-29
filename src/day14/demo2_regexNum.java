package day14;

public class demo2_regexNum {
    public static void main(String args[]) {
        String regex = "[abc]?";
        System.out.println("".matches(regex));//一次或一次也没有
        String regex1 = "[abc]*";
        System.out.println("aaaa".matches(regex1));//零次或多次
        String regex2 = "[abc]+";
        System.out.println("ff".matches(regex2));//一次或多次
        String regex3 = "[abc]{2}";
        System.out.println("aa".matches(regex2));//刚好2次

    }
}
